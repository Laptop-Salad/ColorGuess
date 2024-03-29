package com.example.color_guess

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private var mMediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set up view binding
        val binding: ActivityScoreBinding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showScore()

        val okBtn = binding.scoreOk

        okBtn.setOnClickListener{
            mMediaPlayer = null
            playPop()
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

    //Function to play pop sound
    private fun playPop() {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.pop)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
            mMediaPlayer = null
        }
    }
}