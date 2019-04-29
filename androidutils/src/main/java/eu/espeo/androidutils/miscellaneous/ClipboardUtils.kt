package eu.espeo.androidutils.miscellaneous

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

/**
 * Created by Maciej Kozłowski on 11.12.2018.
 */
object ClipboardUtils {

    fun copyToClipboard(context: Context, label: String, text: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(label, text)
        clipboard.primaryClip = clip
    }
}