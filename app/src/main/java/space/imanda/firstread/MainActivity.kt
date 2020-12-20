package space.imanda.firstread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        val title: TextView = findViewById(R.id.tv_title)
        val subTitle: TextView = findViewById(R.id.tv_sub_title)
        title.text = "Reader"
        subTitle.text = "Reader are Awesome"
    }
}