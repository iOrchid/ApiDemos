package org.zhiwei.libs.baselibs

import java.util.*

/**
 * 作者： 志威  zhiwei.org
 * 主页： Github: https://github.com/zhiwei1990
 * 日期： 2020年03月24日 21:54
 * 签名： 天行健，君子以自强不息；地势坤，君子以厚德载物。
 *      _              _           _     _   ____  _             _ _
 *     / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 *    / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 *   / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 *  /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/  -- 志威 zhiwei.org
 *
 * You never know what you can do until you try !
 * ----------------------------------------------------------------
 * 其他普通的扩展函数
 */

//region 扩展一些常用的属性字段

//当前时间毫秒值
inline val <T> T.nowMillis: Long
    get() = System.currentTimeMillis()

//当前时间 标准格式的string，后续可以扩展更多time相关的属性和函数
inline val <T> T.nowTimeStr: String
    get() = String.format(Locale.getDefault(), "yyyy-MM-dd HH:mm:ss", System.currentTimeMillis())


//endregion