package com.example.nestedrecyclerview

import com.example.nestedrecyclerview.model.Post
import com.example.nestedrecyclerview.model.Story

sealed class Parentitem2(val data :List<Any>){
    class Stories(val story:List<Story>):Parentitem2(story)
    class Posts(val post:List<Post>):Parentitem2(post)
}