package com.example.chatgpt.ViewModal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.chatgpt.Repo.ChatGPTRepository

class ViewModalFactory(val chatRepo: ChatGPTRepository):ViewModelProvider.Factory{
    //We are inherting ViewModelProvider.Factory
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChatGPTViewModel(chatRepo) as T
    }

    //T TYPE : ViewModal
}