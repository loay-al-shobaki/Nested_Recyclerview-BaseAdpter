package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.databinding.ItemStoryBinding
import com.example.nestedrecyclerview.model.Story

class StoryAdpter(
    private var items:List<Story>
):BaseAdpter<ItemStoryBinding,Story>(items){

    override val bindingInFalter: (LayoutInflater, ViewGroup, Boolean) -> ItemStoryBinding
        get() = ItemStoryBinding::inflate

    override fun bindItem(binding: ItemStoryBinding, item: Story) {
       with(binding){
           imgPerson.setImageResource(item.drawableId)
       }
    }
}