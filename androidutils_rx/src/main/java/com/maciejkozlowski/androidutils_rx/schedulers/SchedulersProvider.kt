package com.maciejkozlowski.androidutils_rx.schedulers

import io.reactivex.Scheduler

interface SchedulersProvider {

    fun getObserverScheduler(): Scheduler

    fun getSubscriberScheduler(): Scheduler
}
