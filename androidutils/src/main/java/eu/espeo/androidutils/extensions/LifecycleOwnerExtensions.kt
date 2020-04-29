package eu.espeo.androidutils.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T : Any?, L : LiveData<T>> LifecycleOwner.observe(liveData: L, body: (T?) -> Unit) {
    liveData.observe(this, Observer(body))
}

fun <T : Any?> LiveData<T>.observe(lifecycleOwner: LifecycleOwner, body: (T?) -> Unit) {
    observe(lifecycleOwner, Observer(body))
}