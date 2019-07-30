package com.maciejkozlowski.androidutils_rx.model

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class RxViewModel: ViewModel() {

    protected val compositeDisposable = CompositeDisposable()

    protected fun Disposable.addToCompositeDisposable() {
        compositeDisposable.add(this)
    }

    protected fun clearDisposables() {
        compositeDisposable.clear()
    }

    override fun onCleared() {
        super.onCleared()
        clearDisposables()
    }
}