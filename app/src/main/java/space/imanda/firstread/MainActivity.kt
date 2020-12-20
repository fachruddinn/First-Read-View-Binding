package space.imanda.firstread

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import space.imanda.firstread.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupUI()
    }

    private fun setupUI() {
        /*val title: TextView = findViewById(R.id.tv_title)
        val subTitle: TextView = findViewById(R.id.tv_sub_title)
        title.text = "Reader"
        subTitle.text = "Reader are Awesome"*/

        binding.tvTitle.text = getString(R.string.reader)
        binding.tvSubTitle.text = getString(R.string.reader_are_awesome)
        binding.tvNotesForReader.text = getString(R.string.learn_to_understand)
    }
}