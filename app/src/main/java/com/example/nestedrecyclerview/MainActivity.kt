package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedrecyclerview.databinding.ActivityMainBinding
import com.example.nestedrecyclerview.model.Post
import com.example.nestedrecyclerview.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfStories = listOf(
            Story(R.drawable.img_normal_3),
            Story(R.drawable.img_cold_3),
            Story(R.drawable.img_normal_3),
            Story(R.drawable.img_cold_3),
            Story(R.drawable.img_normal_3),
            Story(R.drawable.img_cold_3),
            Story(R.drawable.img_normal_3),
            Story(R.drawable.img_cold_3),
            Story(R.drawable.img_normal_3),
            Story(R.drawable.img_cold_3),
        )
        val listOfPost = listOf(
            Post(R.drawable.img, "loay"),
            Post(R.drawable.img, "ahmed"),
            Post(R.drawable.img_cold_3, "khalif"),
            Post(R.drawable.img, "loay"),
            Post(R.drawable.img, "loay"),
            Post(R.drawable.img, "ahmed"),
            Post(R.drawable.img, "loay"),
            Post(R.drawable.img, "loay"),
            Post(R.drawable.img, "ahmed"),
            Post(R.drawable.img, "loay"),
        )



        val items = mutableListOf<Parentitem2>()
        items.add(Parentitem2.Stories(listOfStories))
        items.add(Parentitem2.Posts(listOfPost))

        val parentAdpter = ParentAdpter(items)
        binding.RecyclerViewHome.adapter=parentAdpter



    }
}