package org.zhiwei.libs.baselibs

import android.app.Activity
import android.view.View
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * 作者： 志威  zhiwei.org
 * 主页： Github: https://github.com/zhiwei1990
 * 日期： 2020年03月19日 14:39
 * 签名： 天行健，君子以自强不息；地势坤，君子以厚德载物。
 *      _              _           _     _   ____  _             _ _
 *     / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 *    / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 *   / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 *  /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/  -- 志威 zhiwei.org
 *
 * You never know what you can do until you try !
 * ----------------------------------------------------------------
 * Activity相关的扩展
 */

//<editor-folder desc="Activity相关的扩展">
/**
 * Activity中弹出toast提示
 * [text] tips文案
 * [duration] Toast的short或 long的显示flag ，或者填写 0 或 1
 */
fun Activity.showToast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    text?.showToast(this, duration)
}

/**
 * Activity中使用DataBinding时，setContentView
 * [layout] 布局layout
 * @return T 对应layout的binding
 */
fun <T : ViewDataBinding> Activity.bindView(@LayoutRes layout: Int): T {
    return DataBindingUtil.setContentView(this, layout)
}

/**
 * Activity中使用DataBinding时，setContentView
 * [view] View
 * @return T? 对应layout的binding 可能为null
 */
fun <T : ViewDataBinding> Activity.bindView(view: View): T? {
    return DataBindingUtil.bind<T>(view)
}

//</editor-folder>