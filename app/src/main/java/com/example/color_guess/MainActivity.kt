package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val play: Button = findViewById(R.id.play_button)
        val learn: Button = findViewById(R.id.learn_button)
        val about: Button = findViewById(R.id.about_button)

        //Listens to play button and when clicked starts playActivity
        play.setOnClickListener{
            intent = Intent(this,playActivity::class.java)
            startActivity(intent)
        }

        //Listens to learn button and when clicked starts learnActivity
        learn.setOnClickListener{
            intent = Intent(this,learnActivity::class.java)
            startActivity(intent)
        }

        //Listens to about button and when clicked starts aboutActivity
        about.setOnClickListener{
            intent = Intent(this,aboutActivity::class.java)
            startActivity(intent)
        }
    }
}