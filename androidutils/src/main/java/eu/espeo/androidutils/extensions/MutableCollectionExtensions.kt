package eu.espeo.androidutils.extensions

/**
 * Created by Maciej Kozłowski on 2019-11-18.
 */

fun <T> MutableCollection<T>.addIfNeeded(isItemToAdd: Boolean, error: T) {
    if (isItemToAdd) {
        add(error)
    }
}