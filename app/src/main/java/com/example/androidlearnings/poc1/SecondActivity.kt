package com.example.androidlearnings.poc1

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
import com.example.lifecycles.R

class SecondActivity : AppCompatActivity() {

    private lateinit var result: TextView
    private lateinit var prevButton: Button
    private lateinit var nextButton: Button

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

        result = findViewById(R.id.resultView)
        val counterValue = intent.getIntExtra("counterValue", 0)
        result.text  = "You clicked the button $counterValue times"


        prevButton = findViewById(R.id.button3)
        prevButton.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        nextButton = findViewById(R.id.button4)
        nextButton.setOnClickListener {
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)
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