package com.example.chatgpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chatgpt.Database.ChatDatabase
import com.example.chatgpt.Model.ChatModel
import com.example.chatgpt.Model.InputBody
import com.example.chatgpt.Repo.ChatGPTRepository
import com.example.chatgpt.View.Adapaters.ChatGPTAdapter
import com.example.chatgpt.ViewModal.ChatGPTViewModel
import com.example.chatgpt.ViewModal.ViewModalFactory
import com.example.chatgpt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var chatVM: ChatGPTViewModel
    lateinit var chatVMFactory:ViewModalFactory

    private val apiKey = BuildConfig.API_KEY


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chatVMFactory = ViewModalFactory(ChatGPTRepository(ChatDatabase.getChatAPI()))

        //ViewModalProvider attach a lifecyle to VM which persist the data like: rotation, phone calls
        chatVM = ViewModelProvider(this, chatVMFactory).get(ChatGPTViewModel::class.java)





        binding.button.setOnClickListener() {
            chatVM.getChatGPTResult(InputBody(binding.editTextText.text.toString()), "Bearer ${apiKey}")
        }
        //Blank array list of Chat model empty
        val data = arrayListOf<ChatModel>()
        val adapter = ChatGPTAdapter(data)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this)


        chatVM.recyclerViewData.observe(this, {
            adapter.data.clear()
            adapter.data.addAll(it)
            adapter.notifyItemInserted(data.size-1)
            binding.rv.scrollToPosition(data.size-1)

//            Log.d("tag", it.toString())

        })



        //Get the result from Api

        //val chatRepo = ChatGPTRepository(ChatDatabase.getChatAPI())


//        //We are already in main thread
//        lifecycleScope.launch(){
//
//            //We went to background thread
//
//            val data = async(Dispatchers.IO) {
//                chatRepo.getChatResult("Bearer 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", InputBody("What is cat?"))
//
//            }
//
//            //We want to get data so await it and other thing works
//            Log.d("tag", data.await().toString())
////            val data = async(Dispatchers.IO) {
////                chatRepo.getChatResult("Bearer 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", InputBody("What is cat?"))
////
////            }
////
////            Log.d("tag", data.await().toString())
//
//        }

    }


}