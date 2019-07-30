package eu.espeo.androidutils.miscellaneous

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.core.content.getSystemService

/**
 * Created by Maciej Kozłowski on 11.12.2018.
 */
object ClipboardUtils {

    fun copyToClipboard(context: Context, label: String, text: String) {
        val clipboard = context.getSystemService<ClipboardManager>()!!
        val clip = ClipData.newPlainText(label, text)
        clipboard.primaryClip = clip
    }

    fun getFirstItemFromClipboard(context: Context): String? {
        val clipboardManager = context.getSystemService<ClipboardManager>()!!
        return if (clipboardManager.hasPrimaryClip()) {
            clipboardManager.primaryClip!!.getItemAt(0).text.toString()
        } else {
            null
        }
    }

    fun setEmptyClipboard(context: Context) {
        val clipboardManager = context.getSystemService<ClipboardManager>()!!
        clipboardManager.primaryClip = ClipData.newPlainText(null, null)
    }
}