package com.example.chatgpt.ViewModal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chatgpt.Model.ChatGPTResult
import com.example.chatgpt.Model.ChatModel
import com.example.chatgpt.Model.InputBody
import com.example.chatgpt.Repo.ChatGPTRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class ChatGPTViewModel(val chatRepo: ChatGPTRepository): ViewModel() {
    //Import VM and implement the chatRepo

    //create mutableLiveData of ChatGPTResult data type, if anything changes we are
   //val dat = MutableLiveData<ChatGPTResult>(ChatGPTResult())

    //1. Recylcer view needs it to observe to data so we create recyclerViewData by default empty.

    val recyclerViewData = MutableLiveData<ArrayList<ChatModel>>(ArrayList())

    //Here we require


    //2.  getChatGPTResult re
    /*
    recyclerViewData: []
    temp = []
    temp = [1]

    if 1 is added
    * */



     fun getChatGPTResult(body: InputBody, auth: String) {

         val tempData = recyclerViewData.value
         //First user will type
         tempData?.add(ChatModel(body.inputs, true))
         if(tempData !=null ) {
             recyclerViewData.postValue(tempData)

         }
         viewModelScope.launch {

             //We are

             val data = async(Dispatchers.IO) {

                 //Try to try and catch
                 chatRepo.getChatResult(auth, body)
             }

             //Do some business logiv and send it to RV
             //get
             val finalData = data.await()
             //First user will type
             tempData?.add(ChatModel(finalData[0].generated_text, false))

             if(tempData !=null ) {
                 recyclerViewData.postValue(tempData)

             }

            //RV is ready with

         }
     }

}