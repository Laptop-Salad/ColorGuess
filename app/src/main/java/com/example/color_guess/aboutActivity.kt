package com.example.color_guess

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

@Suppress("ClassName")
class aboutActivity : AppCompatActivity() {
    private var mMediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val returnBtn: Button = findViewById(R.id.aboutReturn)

        returnBtn.setOnClickListener{
            mMediaPlayer = null
            playPop()
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    //function to play pop sound
    private fun playPop() {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.blop)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
            mMediaPlayer = null
        }
    }

}