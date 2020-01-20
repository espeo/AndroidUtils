package eu.espeo.androidutils.extensions

import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Created by Maciej Kozłowski on 2019-11-14.
 */

fun Date.toSeconds() : Long = TimeUnit.MILLISECONDS.toSeconds(time)