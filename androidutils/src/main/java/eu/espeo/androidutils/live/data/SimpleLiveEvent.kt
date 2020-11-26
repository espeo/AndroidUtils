package eu.espeo.androidutils.live.data

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread

class SimpleLiveEvent: LiveEvent<Unit?>() {

    /**
     * Used for cases where T is Void, to make calls cleaner.
     */
    @MainThread
    fun call() {
        value = null
    }

    /**
     * Used for cases where T is Void, to make calls cleaner.
     */
    @WorkerThread
    fun post() {
        postValue(null)
    }
}