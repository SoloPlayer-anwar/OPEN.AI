package com.twincom.chatgpt.response


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ChatGptResponse(
    @SerializedName("choices")
    @Expose
    val choices: List<Choice>,
    @SerializedName("created")
    @Expose
    val created: Int,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("model")
    @Expose
    val model: String,
    @SerializedName("object")
    @Expose
    val objectX: String,
    @SerializedName("usage")
    @Expose
    val usage: Usage
)