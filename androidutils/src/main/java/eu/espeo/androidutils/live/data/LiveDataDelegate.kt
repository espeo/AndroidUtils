package eu.espeo.androidutils.live.data

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.Observer
import kotlin.reflect.KProperty

open class LiveDataDelegate<T: Any>(initialState: T): MutableLiveData<T>() {

    init {
        value = initialState
    }

    fun observe(owner: LifecycleOwner, observer: (T) -> Unit) = observe(owner, Observer { observer(it!!) })

    operator fun setValue(ref: Any, p: KProperty<*>, value: T) {
        postValue(value)
    }

    operator fun getValue(ref: Any, p: KProperty<*>): T = value!!
}