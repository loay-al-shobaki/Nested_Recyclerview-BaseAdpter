package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.nestedrecyclerview.databinding.ItemListPostBinding
import com.example.nestedrecyclerview.databinding.ItemListStoriesBinding
import com.example.nestedrecyclerview.model.Post
import com.example.nestedrecyclerview.model.Story

class ParentAdpter( val items: List<Parentitem2>) :
    RecyclerView.Adapter<ParentAdpter.PatentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatentViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_STORY -> {
                val view = ItemListStoriesBinding.inflate(inflate, parent, false)
                StoryViewHolder(view)
            }

            else -> {
                val view = ItemListPostBinding.inflate(inflate, parent, false)
                PostViewHolder(view)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PatentViewHolder, position: Int) {
        when (holder) {
            is StoryViewHolder -> {
                val storyAdpter = StoryAdpter(items[position].data as List<Story>)
                holder.binding.RecyclerViewStories.adapter = storyAdpter
            }

            is PostViewHolder -> {
                val postAdpter = PostAdpter(items[position].data as List<Post>)
                holder.binding.RecyclerViewPost.adapter = postAdpter
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Parentitem2.Stories-> TYPE_STORY
            else -> TYPE_POST
        }
    }

    open class PatentViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root)
    class StoryViewHolder(val binding: ItemListStoriesBinding) : PatentViewHolder(binding)
    class PostViewHolder(val binding: ItemListPostBinding) : PatentViewHolder(binding)

    companion object {
         val TYPE_STORY = R.layout.item_list_stories
         val TYPE_POST:Int = R.layout.item_list_post
    }
}