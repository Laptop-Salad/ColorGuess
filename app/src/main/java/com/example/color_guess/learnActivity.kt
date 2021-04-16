package com.example.color_guess

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityLearnBinding

@Suppress("ClassName")
class learnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding: ActivityLearnBinding = ActivityLearnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val returnButton = binding.learnReturn
        val nextButton = binding.learnNext


        //Listens to the return button and when the user clicks it takes the user to the start page (MainActivity)
        returnButton.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            learn()
        }

    }
    var clickCount = 0

    private fun learn() {


        clickCount += 1
        val learnImage: ImageView = findViewById(R.id.learnImg)
        val learnText = findViewById<TextView>(R.id.learntext)

        //Resets clickCount to 0 when greater than 11 and sets image and text to red
        when {
            clickCount > 11 -> {
                clickCount = 0
                learnImage.setImageResource(R.drawable.red)
                learnText.text = getString(R.string.red)
            }
            //sets image and text to red
            clickCount == 1 -> {
                learnImage.setImageResource(R.drawable.red)
                learnText.text = getString(R.string.red)

            }//sets image and text to orange
            clickCount == 2 -> {
                learnImage.setImageResource(R.drawable.orange)
                learnText.text = getString(R.string.orange)

            }//sets image and text to yellow
            clickCount == 3 -> {
                learnImage.setImageResource(R.drawable.yellow)
                learnText.text = getString(R.string.yellow)

            }//sets image and text to green
            clickCount == 4 -> {
                learnImage.setImageResource(R.drawable.green)
                learnText.text = getString(R.string.green)

            }//sets image and text to blue
            clickCount == 5 -> {
                learnImage.setImageResource(R.drawable.blue)
                learnText.text = getString(R.string.blue)

            }//sets image and text to purple
            clickCount == 6 -> {
                learnImage.setImageResource(R.drawable.purple)
                learnText.text = getString(R.string.purple)

            }//sets image and text to pink
            clickCount == 7 -> {
                learnImage.setImageResource(R.drawable.pig)
                learnText.text = getString(R.string.pink)

            }//sets image and text to white
            clickCount == 8 -> {
                learnImage.setImageResource(R.drawable.white)
                learnText.text = getString(R.string.white)

            }//sets image and text to grey
            clickCount == 9 -> {
                learnImage.setImageResource(R.drawable.grey)
                learnText.text = getString(R.string.grey)

            }//sets image and text to brown
            clickCount == 10 -> {
                learnImage.setImageResource(R.drawable.brown)
                learnText.text = getString(R.string.brown)

            }//sets image and text to black
            clickCount == 11 -> {
                learnImage.setImageResource(R.drawable.black)
                learnText.text = getString(R.string.black)

            }
        }


    }

}
