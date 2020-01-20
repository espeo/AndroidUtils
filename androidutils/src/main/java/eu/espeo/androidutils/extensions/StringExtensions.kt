package eu.espeo.androidutils.extensions

/**
 * Created by Maciej Kozłowski on 2019-10-18.
 */

fun String.getOrNullIfBlank(): String? {
    return if (isNotBlank()) this else null
}