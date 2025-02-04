package com.example.androidLearnings.poc.pocandroidlifecycle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidLearnings.R

class SecondActivity : AppCompatActivity() {

    private lateinit var resultView: TextView
    private lateinit var prevActivityButton: Button
    private lateinit var nextActivityButton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        resultView = findViewById(R.id.resultView)
        val counterValue = intent.getIntExtra(COUNTER_VALUE, 0)
        resultView.text  = "You clicked the button $counterValue times"


        prevActivityButton = findViewById(R.id.prevActivityButton)
        prevActivityButton.setOnClickListener {
            val prevActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(prevActivityIntent)
        }

        nextActivityButton = findViewById(R.id.nextActivityButton)
        nextActivityButton.setOnClickListener {
            val nextActivityIntent = Intent(this, ThirdActivity::class.java)
            startActivity(nextActivityIntent)
        }

        Log.i("Message", "Second activity onCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Message", "Second activity onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message", "Second activity onResume() is called")
    }


    override fun onPause() {
        super.onPause()
        Log.i("Message", "Second activity onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message", "Second activity onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message", "Second activity onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Message", "Second activity onRestart() is called")
    }
}