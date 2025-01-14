package org.ninetripods.mq.study.jetpack.mvvm

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import org.ninetripods.mq.study.CommonWebviewActivity
import org.ninetripods.mq.study.R
import org.ninetripods.mq.study.jetpack.mvvm.base.BaseMvvmActivity
import org.ninetripods.mq.study.jetpack.mvvm.viewmodel.WanViewModel
import org.ninetripods.mq.study.kotlin.ktx.id
import org.ninetripods.mq.study.kotlin.ktx.observe
import org.ninetripods.mq.study.util.Constant

/**
 * Jetpack MVVM
 */
class MvvmExampleActivity : BaseMvvmActivity<WanViewModel>() {

    private val mTvContent: TextView by id(R.id.tv_content)
    private val mBtnQuest: Button by id(R.id.btn_request)
    private val mToolBar: Toolbar by id(R.id.toolbar)
    private val mContentView: ConstraintLayout by id(R.id.cl_content_view)

    override fun getLayoutId(): Int {
        return R.layout.activity_wan_android
    }

    override fun initViews() {
        initToolBar(mToolBar, "Jetpack MVVM", true, true, TYPE_BLOG)
    }

    override fun init() {
        mBtnQuest.setOnClickListener {
            //请求数据
            mViewModel.getWanInfo("")
        }
        /**
         * 这里使用了扩展函数，等同于mViewModel.mWanLiveData.observe(this) {}
         */
        observe(mViewModel.mWanLiveData) { list ->
            if (list == null) return@observe
            val builder = StringBuilder()
            for (index in list.indices) {
                //每条数据进行折行显示
                if (index != list.size - 1) {
                    builder.append(list[index])
                    builder.append("\n\n")
                } else {
                    builder.append(list[index])
                }
            }
            mTvContent.text = builder.toString()
        }
    }


    override fun openWebview() {
        CommonWebviewActivity.webviewEntrance(this, Constant.BLOG_JETPACK_MVVM)
    }

    override fun getStatusOwnerView(): View {
        return mContentView
    }

    /**
     * 发生错误时允许重新请求数据
     */
    override fun retryRequest() {
        mViewModel.getWanInfo("")
    }
}