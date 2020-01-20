package eu.espeo.androidutils.extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

/**
 * Created by Maciej Kozłowski on 2019-08-14.
 */

fun EditText.addOnTextChangeListener(action: (String) -> Unit) {
    addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            // Do nothing
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            // Do nothing
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            action(s.toString())
        }
    })
}