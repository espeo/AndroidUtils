package eu.espeo.androidutils.extentions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes


fun View.show(show: Boolean) {
    if(show) {
        show()
    } else {
        hide()
    }
}

fun View.hide(hide: Boolean) {
    if(hide) {
        hide()
    } else {
        show()
    }
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

const val SHOW = true
const val HIDE = false
