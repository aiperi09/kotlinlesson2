package kg.geektech.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.set
import com.bumptech.glide.Glide
import kg.geektech.kotlinlesson2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val list = arrayListOf<String>().apply {
        add("https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg")
        add("https://tinypng.com/images/social/website.jpg")
        add("https://avatars.mds.yandex.net/i?id=e67c20f98bdc512c5d3bc20c140f8fac-5719595-images-taas-consumers&n=27&h=480&w=480")
        add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMPihIju0BBCwq0HWOFF-aZo8vlz2FCOl7fg&usqp=CAU")
        add("https://c8.alamy.com/comp/FJ6DDE/dubai-city-by-night-FJ6DDE.jpg")
        add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4Q2EQTn5_Kyz9MSqhinHmkyFvNXeU8ZpLWQ&usqp=CAU")
        add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTywBT4HFpMbGPajp7LxiYRoFvK46EEhZ6Jfw&usqp=CAU")
        add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqqPm0gd1yy-UTz1iSuKpRHKyeXcJElSMNWg&usqp=CAU")
        add("https://avatars.mds.yandex.net/i?id=3b8d7920da2e76a6ead6f9398138495a-5378330-images-taas-consumers&n=27&h=480&w=480")
        add("https://images.unsplash.com/flagged/photo-1566127992631-137a642a90f4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&w=1000&q=80")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageClick()
        imageRandom()
    }

    private fun imageRandom() {
        binding.btnEd2.setOnClickListener {
            val random = Random
            val index = random.nextInt(list.size)
            Glide.with(this).load(list.get(index)).into(binding.image1);
        }
    }

    private fun imageClick() {
        binding.btnEd.setOnClickListener {
            if (binding.etText.text.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.empty), Toast.LENGTH_SHORT).show()
            } else {
                list.add(binding.etText.text.toString())
            }
        }

    }

}
