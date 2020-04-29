package eu.espeo.androidutils.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T : Any?, L : LiveData<T>> LifecycleOwner.observe(liveData: L, body: (T) -> Unit) {
    liveData.observe(this, Observer(body))
}

fun <T : Any?> LiveData<T>.observeOptional(lifecycleOwner: LifecycleOwner, body: (T?) -> Unit) {
    observe(lifecycleOwner, Observer(body))
}

// Not yet @Deprecated("Deprecated", ReplaceWith("observeData"), DeprecationLevel.WARNING)
fun <T : Any> LiveData<T>.observe(lifecycleOwner: LifecycleOwner, body: (T) -> Unit) {
    observe(lifecycleOwner, Observer(body))
}

fun <T : Any> LiveData<T>.observeData(lifecycleOwner: LifecycleOwner, body: (T) -> Unit) {
    observe(lifecycleOwner, Observer(body))
}