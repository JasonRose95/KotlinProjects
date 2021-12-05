package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val textEditMe = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            if (timesClicked < 10) {
                timesClicked += 1
            }
            when(timesClicked){
                in 1..4 -> btnClickMe.text = "Click me again"
                in 5..8 -> btnClickMe.text = "I'm tired of being clicked"
                9 -> btnClickMe.text = "You are running out of clicks"
                10 -> btnClickMe.text = "Don't click"
                else -> btnClickMe.text = "Don't click"
            }
                textEditMe.text = timesClicked.toString()
            }
        }
    }