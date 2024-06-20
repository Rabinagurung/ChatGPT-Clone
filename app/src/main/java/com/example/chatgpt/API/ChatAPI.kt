package com.example.chatgpt.API

import com.example.chatgpt.Model.ChatGPTResult
import com.example.chatgpt.Model.InputBody
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

//3. Interface of C
interface ChatAPI {

    //Annot
    @POST("/models/google/gemma-1.1-7b-it")
    suspend fun getChatResult(
        //fun is marked suspended so we gonna use co-routines
        @Header("Authorization") auth:String,
        @Body body:InputBody
    ):ChatGPTResult


}