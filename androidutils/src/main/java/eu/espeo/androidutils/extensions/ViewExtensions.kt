package eu.espeo.androidutils.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes
import androidx.annotation.LayoutRes


const val SHOW = true
const val HIDE = false

fun View.show(show: Boolean) {
    if (show) {
        show()
    } else {
        hide()
    }
}

fun View.hide(hide: Boolean) {
    if (hide) {
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

fun View.invisible(invisible: Boolean) {
    if (invisible) invisible() else show()
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun TextView.showOrHide(text: String?) {
    if (text.isNullOrBlank()) {
        hide()
    } else {
        show()
        this.text = text
    }
}

fun TextView.setTextAndColorAttr(text: String, @AttrRes colorAttr: Int) {
    this.text = text
    this.setTextColorAttr(colorAttr)
}

fun TextView.setTextColorRes(@ColorRes color: Int) {
    setTextColor(context!!.getColorRes(color))
}

fun TextView.setTextColorAttr(@AttrRes color: Int) {
    setTextColorRes(context.resolveThemeAttribute(color))
}
