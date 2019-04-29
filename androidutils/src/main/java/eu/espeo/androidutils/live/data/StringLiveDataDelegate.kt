package eu.espeo.androidutils.live.data

import eu.espeo.androidutils.StringConstants

class StringLiveDataDelegate(initialState: String = StringConstants.EMPTY) : LiveDataDelegate<String>(initialState)