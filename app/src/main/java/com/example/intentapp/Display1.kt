package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.intentapp.R.layout.activity_welcome_screen

class  WelcomeScreen :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_welcome_screen)

        val message:String? = intent.getStringExtra("NAME")+" "+  intent.getStringExtra("NAME2")


        val showName: TextView = findViewById(R.id.textView)

        showName.text = "$message"


    }
}