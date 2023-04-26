package com.twincom.chatgpt.requestbody

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequestBody(
    @Expose
    @SerializedName("model")
    val model:String,

    @Expose
    @SerializedName("prompt")
    val prompt: String,

    @Expose
    @SerializedName("max_tokens")
    val max_tokens: Int,

    @Expose
    @SerializedName("temperature")
    val temperature: Int,


)
