package com.example.androidLearnings.poc.poc_androidLifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lifecycles.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i("Message", "Third activity onCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Message", "Third activity onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message", "Third activity onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Message", "Third activity onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message", "Third activity onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message", "Third activity onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Message", "Third activity onRestart() is called")
    }
}