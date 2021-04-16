@file:Suppress("ClassName")

package com.example.color_guess

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityPlayBinding

class playActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayBinding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}