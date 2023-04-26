package com.twincom.chatgpt.network




import com.twincom.chatgpt.requestbody.RequestBody
import com.twincom.chatgpt.response.ChatGptResponse
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface EndPoint {
    @POST("completions")
    fun submitChatGpt(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authHeader: String,
        @Body requestBody: RequestBody
    ) : Observable<Response<ChatGptResponse>>
}