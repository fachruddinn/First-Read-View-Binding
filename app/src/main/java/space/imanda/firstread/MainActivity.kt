package space.imanda.firstread

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import space.imanda.firstread.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

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
        /*
        // When Using "findViewById"
        val title: TextView = findViewById(R.id.tv_title)
        val subTitle: TextView = findViewById(R.id.tv_sub_title)
        title.text = getString(R.string.reader)
        subTitle.text = getString(R.string.reader_are_awesome)
        */

        // When Using View Binding
        binding.tvTitle.text = getString(R.string.reader)
        binding.tvSubTitle.text = getString(R.string.reader_are_awesome)
        binding.tvNotesForReader.text = getString(R.string.learn_to_understand)
        // binding.loInfoDate.tvDate.text = getString(R.string.date)

        setDate()
    }

    @SuppressLint("SimpleDateFormat")
    private fun setDate() {
        val sdf = SimpleDateFormat("dd/MMM/yyyy hh.mm")
        val currentDate = sdf.format(Date())
        binding.loInfoDate.tvDate.text = currentDate
    }
}