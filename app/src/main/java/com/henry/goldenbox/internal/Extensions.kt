package com.henry.goldenbox.internal

import android.app.Activity
import android.os.Build
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.henry.goldenbox.R

/**
 * .:.:.:. Created by @henrywm on 20/02/19 .:.:.:.
 */

fun Fragment.toggleFloatingActionButtonVisibility(isVisible: Boolean){
    val floatingActionButton= this.activity?.findViewById<FloatingActionButton>(R.id.add_money_button)
    if (isVisible) floatingActionButton?.show() else floatingActionButton?.hide()
}

fun Activity.statusBarColor(color: Int){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.apply {
            //decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            statusBarColor = color
        }
    }
}