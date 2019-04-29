package eu.espeo.androidutils.rx

import androidx.lifecycle.LiveDataReactiveStreams
import io.reactivex.*

fun <T> Flowable<T>.toLiveData() = LiveDataReactiveStreams.fromPublisher(this)

fun <T> Flowable<T>.toLiveData(schedulers: SchedulersProvider) =
    LiveDataReactiveStreams.fromPublisher(this.schedule(schedulers))

fun <T> Observable<T>.toLiveData() = LiveDataReactiveStreams.fromPublisher(this.toFlowable(BackpressureStrategy.BUFFER))

fun <T> Observable<T>.toLiveData(schedulers: SchedulersProvider) =
        LiveDataReactiveStreams.fromPublisher(this.toFlowable(BackpressureStrategy.BUFFER).schedule(schedulers))

fun <T> Single<T>.toLiveData() = LiveDataReactiveStreams.fromPublisher(this.toFlowable())

fun <T> Single<T>.toLiveData(schedulers: SchedulersProvider) =
        LiveDataReactiveStreams.fromPublisher(this.toFlowable().schedule(schedulers))

fun <T> Flowable<T>.schedule(schedulers: SchedulersProvider): Flowable<T> {
    return subscribeOn(schedulers.getSubscriberScheduler())
            .observeOn(schedulers.getObserverScheduler())
}

fun <T> Single<T>.schedule(schedulers: SchedulersProvider): Single<T> {
    return subscribeOn(schedulers.getSubscriberScheduler())
            .observeOn(schedulers.getObserverScheduler())
}

fun Completable.schedule(schedulers: SchedulersProvider): Completable {
    return subscribeOn(schedulers.getSubscriberScheduler())
            .observeOn(schedulers.getObserverScheduler())
}