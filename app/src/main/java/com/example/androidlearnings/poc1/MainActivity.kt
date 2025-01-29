package com.example.androidlearnings.poc1

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

class MainActivity : AppCompatActivity() {

    private lateinit var textview: TextView
    private lateinit var plusone: Button
    private lateinit var next: Button
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textview = findViewById(R.id.textView)
        plusone = findViewById(R.id.button)
        next = findViewById(R.id.button2)

        Log.i("Message", "First activity onCreate() is called")

        plusone.setOnClickListener {
            counter++
            textview.text = "$counter"
        }

        next.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("counterValue", counter)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Message", "First activity onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message", "First activity onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Message", "First activity onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message", "First activity onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message", "First activity onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Message", "First activity onRestart() is called")
    }
}