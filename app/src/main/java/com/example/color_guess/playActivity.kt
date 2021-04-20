@file:Suppress("ClassName")

package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityPlayBinding

class playActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayBinding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Finding buttons and ImageView
        val nextBtn = binding.playNext
        val doneBtn = binding.doneButton
        var image = binding.playImg

        image.setImageResource(R.drawable.red)

        //Takes user back to the start page (MainActivity)
        nextBtn.setOnClickListener{
            done()
        }

        //Goes to next question
        doneBtn.setOnClickListener{
            next()
        }
    }
    //Variable to count how many times the next button is clicked
    var clickCount = 0

    //This function is called when the next button is clicked
    private fun next(){
        //Finding the ImageView
        var image = findViewById<ImageView>(R.id.playImg)
        //Finding the EditText View
        var text = findViewById<EditText>(R.id.textInput)

        clickCount += 1

        when(clickCount){
            1 -> {
                image.setImageResource(R.drawable.orange)
            }
            2 -> {

            }
        }

    }

    //This function is called when the done button is clicked
    private fun done(){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}