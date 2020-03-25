package com.example.intentapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val press:Button = findViewById(R.id.button)
        val name: EditText = findViewById(R.id.editText)
        val name2:EditText=findViewById(R.id.editText)

        press.setOnClickListener {
            explicitIntent(name.text.toString(),name2.text.toString())

        }
    }

    private  fun explicitIntent(name: String,name2:String){
        val intent = Intent(this,WelcomeScreen::class.java)

        intent.putExtra("NAME",name)
        intent.putExtra("NAME2",name2)

        startActivity(intent)
    }


}