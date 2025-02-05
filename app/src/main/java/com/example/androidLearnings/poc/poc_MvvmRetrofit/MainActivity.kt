package com.example.androidLearnings.poc.poc_MvvmRetrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidLearnings.R
import com.example.androidLearnings.poc.poc_MvvmRetrofit.api.ApiInterface
import com.example.androidLearnings.poc.poc_MvvmRetrofit.api.ApiUtilities
import com.example.androidLearnings.poc.poc_MvvmRetrofit.repository.MemesRepository
import com.example.androidLearnings.poc.poc_MvvmRetrofit.viewmodel.MemesViewModel
import com.example.androidLearnings.poc.poc_MvvmRetrofit.viewmodel.MemesViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var memesViewModel: MemesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.empty_activity)


        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)

        val memesRepository = MemesRepository(apiInterface)

        memesViewModel = ViewModelProvider(this, MemesViewModelFactory(memesRepository))[MemesViewModel::class.java]
        memesViewModel.memes.observe(this){
//            Log.v("HAHA", "onCreate: ${it.toString()}")

            it.data.memes.iterator().forEach { meme ->
                Log.d("HAHA", "name: ${meme.name}\nImage: ${meme.url}")
            }
        }
    }
}