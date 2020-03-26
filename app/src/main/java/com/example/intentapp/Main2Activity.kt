package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val showName: TextView = findViewById(R.id.textView)

        showName.text =  intent.getStringExtra("NAME")+"  "+  intent.getStringExtra("Text22")
    }
}
