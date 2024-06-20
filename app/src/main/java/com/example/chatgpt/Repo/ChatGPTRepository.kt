package com.example.chatgpt.Repo

import android.annotation.SuppressLint
import com.example.chatgpt.API.ChatAPI
import com.example.chatgpt.Model.ChatGPTResult
import com.example.chatgpt.Model.InputBody

//ChatAPI interface has method getChatResult which we need so? How? but we gonna create another method


//ASk someone else to prvoide the API class (we dont have to get Database)
//Who ever creates ChatGPTRepository provide the ChatAPI class
class ChatGPTRepository(val chatAPI: ChatAPI) {

    //whoever implement getChatResult must pass auth and body properties

    suspend fun  getChatResult(auth: String, body: InputBody): ChatGPTResult{
      val data = chatAPI.getChatResult(auth, body)
        return data

    }






}


//Doing this to make it reusable.

//Dependency injection: It will automatically create the class for you and