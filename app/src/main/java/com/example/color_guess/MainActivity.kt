package com.example.color_guess

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityMainBinding
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    private var mMediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val play = binding.playButton
        val learn = binding.learnButton
        val about = binding.aboutButton

        //Listens to play button and when clicked starts playActivity
        play.setOnClickListener {
            mMediaPlayer = null
            playBlop()
            intent = Intent(this, playActivity::class.java)
            startActivity(intent)
        }

        //Listens to learn button and when clicked starts learnActivity
        learn.setOnClickListener {
            mMediaPlayer = null
            playBlop()
            intent = Intent(this, learnActivity::class.java)
            startActivity(intent)
        }

        //Listens to about button and when clicked starts aboutActivity
        about.setOnClickListener {
            mMediaPlayer = null
            playBlop()
            intent = Intent(this, aboutActivity::class.java)
            startActivity(intent)
        }
    }
    //function to play blop sound
    private fun playBlop() {
        if (mMediaPlayer == null ) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.blop)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
            mMediaPlayer = null
        }
    }
}