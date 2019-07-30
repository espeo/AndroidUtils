package com.maciejkozlowski.androidutils_rx.schedulers

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DefaultSchedulersProvider: SchedulersProvider {

    override fun getObserverScheduler(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    override fun getSubscriberScheduler(): Scheduler {
        return Schedulers.io()
    }

}