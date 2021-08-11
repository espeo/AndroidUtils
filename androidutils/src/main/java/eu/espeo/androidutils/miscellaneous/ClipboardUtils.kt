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
        val clipboardManager = context.getSystemService<ClipboardManager>()!!
        val clipData = ClipData.newPlainText(label, text)
        clipboardManager.setPrimaryClip(clipData)
    }

    fun getFirstItemFromClipboard(context: Context): String? {
        val clipboardManager = context.getSystemService<ClipboardManager>()!!
        return clipboardManager.primaryClip?.getItemAt(0)?.text?.toString()
    }

    fun setEmptyClipboard(context: Context) {
        val clipboardManager = context.getSystemService<ClipboardManager>()!!
        val emptyClipData = ClipData.newPlainText(null, null)
        clipboardManager.setPrimaryClip(emptyClipData)
    }
}