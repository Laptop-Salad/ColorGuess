package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set up view binding
        val binding: ActivityScoreBinding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showScore()

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

    private fun showScore() {
        val score = intent.getStringExtra("answer").toString()
        val scoreView = findViewById<TextView>(R.id.scoreView)

        scoreView.text = score

    }
}