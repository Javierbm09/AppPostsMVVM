package com.example.apppostsmvvm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "PostsEntity")
data class QuoteModel(
    @SerializedName("userId") var userId:Int,
    @SerializedName("id")  var id:Int,
    @SerializedName("title") var title:String,
    @SerializedName("body") var body:String

    )