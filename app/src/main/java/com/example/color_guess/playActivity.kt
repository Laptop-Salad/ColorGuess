@file:Suppress("ClassName")

package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
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

        //The first image the user sees will be red
        image.setImageResource(R.drawable.red)

        //Takes user back to the start page (MainActivity)
        nextBtn.setOnClickListener{
            next()
        }

        //Goes to next question
        doneBtn.setOnClickListener{
            done()
        }

    }
    //Variable to count how many times the next button is clicked
    private var clickCount = 0

    //This function is called when the next button is clicked
    private fun next(){
        //Finding the ImageView
        val image = findViewById<ImageView>(R.id.playImg)
        //Finding the EditText View
        val text = findViewById<EditText>(R.id.textInput)
        //Finding Next Button
        val nextBtn = findViewById<Button>(R.id.play_next)
        //Finding Done Button
        val doneBtn = findViewById<Button>(R.id.doneButton)

        clickCount += 1


        when(clickCount){
            1 -> {
                image.setImageResource(R.drawable.orange) //Sets image to orange
                val red = text.text //Gets text from EditText
                text.setText(getString(R.string.what_colour_is_this)) //Sets EditText to question string
            }
            2 -> {
                image.setImageResource(R.drawable.yellow) //Sets image to yellow
                val orange = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            3 -> {
                image.setImageResource(R.drawable.green) //Sets image to green
                val yellow = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            4 -> {
                image.setImageResource(R.drawable.blue) //Sets image to blue
                val green = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            5 -> {
                image.setImageResource(R.drawable.purple) //Sets image to purple
                val blue = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            6 -> {
                image.setImageResource(R.drawable.pig) //Sets image to pink
                val purple = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            7 -> {
                image.setImageResource(R.drawable.white) //Sets image to white
                val pink = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            8 -> {
                image.setImageResource(R.drawable.grey) //Sets image to grey
                val white = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            9 -> {
                image.setImageResource(R.drawable.brown) //Sets image to brown
                val grey = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            10 -> {
                image.setImageResource(R.drawable.black) //Sets image to black
                val brown = text.text
                text.setText(getString(R.string.what_colour_is_this))
            }
            11 -> {
                val black = text.text
                nextBtn.visibility = View.INVISIBLE //Makes next button invisible
                doneBtn.visibility = View.INVISIBLE //Makes done button invisible
                //image.visibility = View.INVISIBLE //Makes the image invisible
                //text.visibility = View.INVISIBLE //Makes the text invisible

                toScore()
            }
        }

    }
    private fun toScore(){
        intent = Intent(this, ScoreActivity::class.java)
        startActivity(intent)
    }
    //This function is called when the done button is clicked
    private fun done(){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}