@file:Suppress("ClassName")

package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityPlayBinding


class playActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayBinding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextBtn = binding.playNext
        val doneBtn = binding.doneButton
        val playImg = binding.playImg

        playImg.setImageResource(R.drawable.red) //Sets the first picture the user will see to red

        nextBtn.setOnClickListener{
        }

        doneBtn.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}

