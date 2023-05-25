package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.databinding.ItemPostBinding
import com.example.nestedrecyclerview.model.Post

class PostAdpter(val items: List<Post>) : BaseAdpter<ItemPostBinding, Post>(items) {
    override val bindingInFalter: (LayoutInflater, ViewGroup, Boolean) -> ItemPostBinding
        get() = ItemPostBinding::inflate

    override fun bindItem(binding: ItemPostBinding, item: Post) {
        with(binding){
            imageView.setImageResource(item.drawableId)
            textView.text = item.nameUser
        }

    }
}