package eu.espeo.androidutils

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import eu.espeo.androidutils.extensions.observe
import eu.espeo.androidutils.live.data.LiveEvent

class MainActivity : AppCompatActivity() {

    private val liveData = LiveEvent<Unit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        liveData.observe(this) { onAction() }
    }

    private fun onAction() {
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
    }
}
