@file:Suppress("ClassName")

package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityPlayBinding
import java.util.*

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
        nextBtn.setOnClickListener {
            next()
        }

        //Goes to next question
        doneBtn.setOnClickListener {
            done()
        }

    }

    //Variable to count how many times the next button is clicked
    private var clickCount = 0
    private var smallCount = 0

    //Finding the ImageView
    private val image = findViewById<ImageView>(R.id.playImg)

    //Finding the EditText View
    private val text = findViewById<EditText>(R.id.textInput)

    //Finding Next Button
    private val nextBtn = findViewById<Button>(R.id.play_next)

    //Finding Done Button
    private val doneBtn = findViewById<Button>(R.id.doneButton)
    private val answer = findViewById<TextView>(R.id.answer)

    //This function is called when the next button is clicked
    private fun next() {

        smallCount += 1

        when (smallCount) {
            1 -> {
                val red = text.text.toString().toLowerCase(Locale.ROOT) //Gets text from EditText

                if (red == getString(R.string.red).toLowerCase(Locale.ROOT)) { //Checks Answer
                    answer.text = getString(R.string.correct)
                } else {
                    answer.text = getString(R.string.wrong)
                }

                loading()
                invisible()
                Thread.sleep(500L) //Waits for 5 seconds before moving on
                clickCount += 1
            }
            2 -> {
                val orange = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            3 -> {
                val yellow = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            4 -> {
                val green = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            5 -> {
                val blue = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            6 -> {
                val purple = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            7 -> {
                val pink = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            8 -> {
                val white = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            9 -> {
                val grey = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            10 -> {
                val brown = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
            11 -> {
                val black = text.text.toString().toLowerCase(Locale.ROOT)
                invisible()
            }
        }

        when (clickCount) {
            1 -> {
                image.setImageResource(R.drawable.orange) //Sets image to orange
                text.setText(getString(R.string.what_colour_is_this)) //Sets EditText to question string
            }
            2 -> {
                image.setImageResource(R.drawable.yellow) //Sets image to yellow
                text.setText(getString(R.string.what_colour_is_this))
            }
            3 -> {
                image.setImageResource(R.drawable.green) //Sets image to green
                text.setText(getString(R.string.what_colour_is_this))
            }
            4 -> {
                image.setImageResource(R.drawable.blue) //Sets image to blue
                text.setText(getString(R.string.what_colour_is_this))
            }
            5 -> {
                image.setImageResource(R.drawable.purple) //Sets image to purple
                text.setText(getString(R.string.what_colour_is_this))
            }
            6 -> {
                image.setImageResource(R.drawable.pig) //Sets image to pink
                text.setText(getString(R.string.what_colour_is_this))
            }
            7 -> {
                image.setImageResource(R.drawable.white) //Sets image to white
                text.setText(getString(R.string.what_colour_is_this))
            }
            8 -> {
                image.setImageResource(R.drawable.grey) //Sets image to grey
                text.setText(getString(R.string.what_colour_is_this))
            }
            9 -> {
                image.setImageResource(R.drawable.brown) //Sets image to brown
                text.setText(getString(R.string.what_colour_is_this))
            }
            10 -> {
                image.setImageResource(R.drawable.black) //Sets image to black
                text.setText(getString(R.string.what_colour_is_this))
            }
            11 -> {
                invisible()
                toScore()
            }
        }

    }

    private fun toScore() {
        intent = Intent(this, ScoreActivity::class.java)
        startActivity(intent)
    }

    //This function is called when the done button is clicked
    private fun done() {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    //Makes Buttons Invisible
    private fun invisible() {
        nextBtn.visibility = View.INVISIBLE //Makes next button invisible
        doneBtn.visibility = View.INVISIBLE //Makes done button invisible
    }

    private fun loading() { //Sets image to loading image
        image.setImageResource(R.drawable.loading)
    }
}