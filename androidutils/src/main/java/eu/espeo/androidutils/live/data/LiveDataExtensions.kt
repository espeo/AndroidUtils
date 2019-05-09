package eu.espeo.androidutils.live.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations

fun <X, Y> LiveData<X>.switchMap(switchMapFunction: (X) -> LiveData<Y>?): LiveData<Y> {
    return Transformations.switchMap(this, switchMapFunction)
}

fun <X, Y> LiveData<X>.map(mapFunction: (X) -> Y): LiveData<Y> {
    return Transformations.map(this, mapFunction)
}