package com.twincom.chatgpt.response


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Choice(
    @SerializedName("finish_reason")
    @Expose
    val finishReason: String,
    @SerializedName("index")
    @Expose
    val index: Int,
    @SerializedName("logprobs")
    @Expose
    val logprobs: String,
    @SerializedName("text")
    @Expose
    val text: String
)