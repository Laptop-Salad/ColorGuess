package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set up view binding
        val binding: ActivityScoreBinding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val okBtn = binding.scoreOk

        okBtn.setOnClickListener{
            ok()
        }
    }

    //When the ok button is clicked the user is taken to the main page (MainActivity)
    private fun ok() {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}