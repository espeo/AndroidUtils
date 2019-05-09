package eu.espeo.androidutils.extensions

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.widget.Toast
import androidx.annotation.*
import androidx.core.content.ContextCompat

@AnyRes
fun Context.resolveThemeAttribute(@AttrRes attr: Int): Int {
    val value = TypedValue()
    theme.resolveAttribute(attr, value, true)
    return value.resourceId
}

fun Context.getSelectableItemBackground(): Drawable? {
    return getDrawableAttr(android.R.attr.selectableItemBackground)
}

fun Context.getDimensionPixelSize(@DimenRes resId: Int): Int {
    return resources.getDimensionPixelSize(resId)
}

fun Context.getDimension(@DimenRes resId: Int): Float {
    return resources.getDimension(resId)
}

fun Context.getDrawableAttr(@AttrRes attr: Int): Drawable? {
    return getDrawableRes(resolveThemeAttribute(attr))
}

fun Context.getDrawableRes(@DrawableRes resId: Int): Drawable? {
    return ContextCompat.getDrawable(this, resId)
}

fun Context.toast(@StringRes stringId: Int) {
    Toast.makeText(this, stringId, Toast.LENGTH_LONG).show()
}

fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Context.getColorRes(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)

fun Context.getColorAttr(@AttrRes attr: Int) = getColorRes(resolveThemeAttribute(attr))