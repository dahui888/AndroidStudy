package org.ninetripods.mq.study.kotlin.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import org.ninetripods.mq.study.kotlin.ktx.log
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

class FlowViewModel : ViewModel() {
    //MutableStateFlow 可读可写
    private val _stateFlow = MutableStateFlow(DataState.Success("default"))

    //StateFlow 只可读
    val mStateFlow: StateFlow<DataState> = _stateFlow

    //flow通过stateIn转化为StateFlow
    val flowConvertStateFlow by lazy {
        flow {
            //转化为StateFlow是 emit()可以是0个或1个 或多个，当是多个时，新订阅者collect只会收到最后一个值(replay为1)
            emit("1、flow convert StateFlow")
        }
            .stateIn(
                viewModelScope, //协程作用域范围
                //----SharingStarted:控制共享的开始、结束策略---        -
                //1、SharingStarted.Eagerly, //Eagerly：马上开始，在scope作用域结束时终止
                //2、SharingStarted.Lazily, //Lazily：当订阅者出现时开始，在scope作用域结束时终止
                //3、SharingStarted.WhileSubscribed(stopTimeoutMillis: Long = 0,replayExpirationMillis: Long = Long.MAX_VALUE)
                // stopTimeoutMillis：表示最后一个订阅者结束订阅与停止上游流的时间差，默认值为0（立即停止上游流）
                // replayExpirationMillis：数据重播的超时时间。
                SharingStarted.WhileSubscribed(5000), //立即开始
                "0、initialValue" // 默认StateFlow的初始值，会发送到下游
            ).onStart { log("onStart") }
    }

    //SharedFlow
    private val _sharedFlow = MutableSharedFlow<String>(
        replay = 0,//重播给新订阅者的数量
        extraBufferCapacity = 1,//当有剩余缓冲空间时，emit不会挂起
        onBufferOverflow = BufferOverflow.DROP_OLDEST //配置缓冲区的溢出操作
    )
    val mSharedFlow: SharedFlow<String> = _sharedFlow

    //flow通过shareIn转化为SharedFlow
    val flowConvertSharedFlow by lazy {
        flow {
            emit("1、flow")
            emit("2、convert")
            emit("3、SharedFlow")
        }.shareIn(
            viewModelScope, //协程作用域范围
            //----SharingStarted:控制共享的开始、结束策略----
            //1、SharingStarted.Eagerly, //Eagerly：马上开始，在scope作用域结束时终止
            //2、SharingStarted.Lazily, //Lazily：当订阅者出现时开始，在scope作用域结束时终止
            //3、SharingStarted.WhileSubscribed(stopTimeoutMillis: Long = 0,replayExpirationMillis: Long = Long.MAX_VALUE)
            // stopTimeoutMillis：表示最后一个订阅者结束订阅与停止上游流的时间差，默认值为0（立即停止上游流）
            // replayExpirationMillis：数据重播的超时时间。
            SharingStarted.Eagerly,
            replay = 3 //重播给新订阅者的数量
        ).onStart { log("onStart") }
    }

    fun fetchStateFlowData() {
        viewModelScope.launch {
            flow {
                emit("stateFlow1")
                emit("stateFlow2")
            }.map { value -> "map:$value" }
                .onEach { value -> log("onEach:$value") }
                .collect { value -> _stateFlow.value = DataState.Success(value) }

        }
    }

    fun fetchSharedFlowData() {
        log("tryEmit: sharedFlow1")
        _sharedFlow.tryEmit("sharedFlow1")
        log("tryEmit: sharedFlow2")
        _sharedFlow.tryEmit("sharedFlow2")
        log("tryEmit: sharedFlow3")
        _sharedFlow.tryEmit("sharedFlow3")
    }

    /**
     * suspendCancellableCoroutine将回调转化为协程使用
     */
    suspend fun suspendCancelableData(): String {
        return try {
            getSccInfo()
        } catch (e: Exception) {
            "error: ${e.message}"
        }
    }

    /**
     * suspendCancellableCoroutine将回调转化为协程使用
     */
    private suspend fun getSccInfo(): String = suspendCancellableCoroutine { continuation ->
        val callback = object : ICallBack {
            override fun onSuccess(sucStr: String?) {
                //1、返回结果 将结果赋值给getSccInfo()挂起函数的返回值
                //2、如果调用了continuation.cancel()，resume()的结果将不会返回了，因为协程取消了
                continuation.resume(sucStr ?: "empty")
            }

            override fun onError(error: Exception) {
                //这里会将异常抛给上层 需要上层进行处理
                continuation.resumeWithException(error)
            }
        }
        continuation.invokeOnCancellation {
            //协程取消时调用，可以在这里进行解注册
            log("invokeOnCancellation")
        }

        //模拟网络请求 此时协程被suspendCancellableCoroutine挂起，直到触发回调
        Thread {
            Thread.sleep(500)
            //模拟Server返回数据
            callback.onSuccess("getServerInfo")
            //模拟抛异常
            //callback.onError(IllegalArgumentException("server error"))
        }.start()

        //模拟取消协程
        //continuation.cancel()
    }

    /**
     * callbackFlow使用举例
     */
    @ExperimentalCoroutinesApi
    fun getSearchCallbackFlow(): Flow<Boolean> = callbackFlow {
        val callback = object : ICallBack {
            override fun onSuccess(sucStr: String?) {
                trySend(true)
            }

            override fun onError(error: Exception) {
                trySend(false)
            }
        }
        //模拟网络请求
        Thread {
            Thread.sleep(500)
            //模拟Server返回数据
            callback.onSuccess("getServerInfo")
            //模拟抛异常
            //callback.onError(IllegalArgumentException("server error"))
        }.start()

        //这是一个挂起函数, 当 flow 被关闭的时候 block 中的代码会被执行 可以在这里取消接口的注册等
        awaitClose { log("awaitClose") }
    }

    /**
     * callbackFlow使用举例
     */
    @ExperimentalCoroutinesApi
    fun goDesCallbackFlow(isSuc: Boolean): Flow<String?> = callbackFlow {
        val callback = object : ICallBack {
            override fun onSuccess(sucStr: String?) {
                trySend(sucStr)
            }

            override fun onError(error: Exception) {
                trySend(error.message)
            }
        }
        //模拟网络请求
        Thread {
            Thread.sleep(500)
            if (isSuc) {
                //到达目的地
                callback.onSuccess("arrive at the destination")
            } else {
                //发生了错误
                callback.onError(IllegalArgumentException("Not at destination"))
            }
        }.start()

        awaitClose { log("awaitClose") }
    }

}