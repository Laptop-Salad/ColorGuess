package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

@Suppress("ClassName")
class aboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val returnBtn: Button = findViewById(R.id.aboutReturn)
        returnBtn.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}