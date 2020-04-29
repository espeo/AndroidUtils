package eu.espeo.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import eu.espeo.androidutils.extensions.observe
import eu.espeo.androidutils.extensions.observeData
import eu.espeo.androidutils.extensions.observeLiveData
import eu.espeo.androidutils.extensions.observeOptional
import eu.espeo.androidutils.live.data.LiveEvent

class MainActivity : AppCompatActivity() {

    private val liveData = LiveEvent<Unit>()
    private val liveData2 = MutableLiveData<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        liveData.observeOptional(this) { onAction() }
        liveData2.observeData(this, this::onAction2)
    }

    private fun onAction() {
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
    }

    private fun onAction2(data: Any) {
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
    }
}
