package eu.espeo.androidutils.rx

import io.reactivex.Scheduler

interface SchedulersProvider {

    fun getObserverScheduler(): Scheduler

    fun getSubscriberScheduler(): Scheduler
}
