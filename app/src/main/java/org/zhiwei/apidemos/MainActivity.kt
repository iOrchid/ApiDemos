package org.zhiwei.apidemos

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import org.zhiwei.accessibility.AccessibilityActivity
import org.zhiwei.animation.AnimationActivity
import org.zhiwei.apidemos.databinding.ActivityMainBinding
import org.zhiwei.app.AppActivity
import org.zhiwei.content.ContentActivity
import org.zhiwei.graphics.GraphicsActivity
import org.zhiwei.hardware.HardwareActivity
import org.zhiwei.media.MediaActivity
import org.zhiwei.nfc.NfcActivity
import org.zhiwei.os.OSActivity
import org.zhiwei.preference.PreferenceActivity
import org.zhiwei.security.SecurityActivity
import org.zhiwei.views.ViewsActivity

/**
 * 作者： 志威  zhiwei.org
 * 主页： Github: https://github.com/zhiwei1990
 * 日期： 2019年11月29日 19:26
 * 签名： 天行健，君子以自强不息；地势坤，君子以厚德载物。
 *      _              _           _     _   ____  _             _ _
 *     / \   _ __   __| |_ __ ___ (_) __| | / ___|| |_ _   _  __| (_) ___
 *    / _ \ | '_ \ / _` | '__/ _ \| |/ _` | \___ \| __| | | |/ _` | |/ _ \
 *   / ___ \| | | | (_| | | | (_) | | (_| |  ___) | |_| |_| | (_| | | (_) |
 *  /_/   \_\_| |_|\__,_|_|  \___/|_|\__,_| |____/ \__|\__,_|\__,_|_|\___/  -- 志威 zhiwei.org
 *
 * You never know what you can do until you try !
 * ----------------------------------------------------------------
 * 整个ApiDemos示例App的入口界面
 */
class MainActivity : AppCompatActivity() {

    companion object {
        //各个模块的入口Activity的配置
        private val modules = arrayListOf(
            AccessibilityActivity::class,
            AnimationActivity::class,
            AppActivity::class,
            ContentActivity::class,
            GraphicsActivity::class,
            HardwareActivity::class,
            MediaActivity::class,
            NfcActivity::class,
            OSActivity::class,
            PreferenceActivity::class,
            SecurityActivity::class,
            ViewsActivity::class
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val activities = modules.map { it.simpleName }
        binding.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, activities)
        binding.lvMain.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(this, modules[position].java))
        }
    }

}