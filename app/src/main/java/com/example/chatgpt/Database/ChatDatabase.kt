package com.example.chatgpt.Database

import com.example.chatgpt.API.ChatAPI
import com.example.chatgpt.BuildConfig
import com.example.chatgpt.Model.ChatGPTResult
import com.example.chatgpt.Model.InputBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//We are creating singleton

object ChatDatabase {
    private const val baseURL = BuildConfig.BASE_URL
    //returns same data type of interface
    fun getChatAPI(): ChatAPI{

        //the getChatAPI is the func that returns class of ChatAPI


        //Starting to build retrofit we need baseUrl and convertor factory to convert JSon to gson and pass the Interface on create
        val actualClass =  Retrofit.Builder().baseUrl(baseURL).
        addConverterFactory(GsonConverterFactory.create()).build().create(ChatAPI::class.java)

        return  actualClass

    }

}




