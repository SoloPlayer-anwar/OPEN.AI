package com.twincom.chatgpt.response


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Usage(
    @SerializedName("completion_tokens")
    @Expose
    val completionTokens: Int,
    @SerializedName("prompt_tokens")
    @Expose
    val promptTokens: Int,
    @SerializedName("total_tokens")
    @Expose
    val totalTokens: Int
)