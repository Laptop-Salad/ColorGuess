@file:Suppress("ClassName")

package com.example.color_guess

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.color_guess.databinding.ActivityPlayBinding


class playActivity : AppCompatActivity() {
    private var mMediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayBinding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = binding.playImg
        image.setImageResource(R.drawable.red)

        val doneBtn = binding.doneButton
        val nextBtn = binding.playNext

        doneBtn.setOnClickListener{
            mMediaPlayer = null
            playPop()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        nextBtn.setOnClickListener{
            mMediaPlayer = null
            playBlop()
            checkAnswer()
        }
    }
    private var smallCount = 0
    private var correct = 0

    private fun checkAnswer(){ //Function to check answers
        smallCount += 1

        when(smallCount){
            1 -> red()
            2 -> orange()
            3 -> yellow()
            4 -> green()
            5 -> blue()
            6 -> purple()
            7 -> pink()
            8 -> white()
            9 -> grey()
            10 -> brown()
            11 -> black()
        }

    }

    //Shows toast for correct answer
    private fun correctToast(){
        val text = "Correct!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext,text,duration)

        toast.show()
    }


    //Shows toast for wrong answer
    private fun wrongToast(){
        val text = "Wrong"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext,text,duration)

        toast.show()
    }

    //Checks red answer
    private fun red() {
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "red"){
            correctToast()
            correct += 1
        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.orange)
    }

    //Check orange answer
    private fun orange(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "orange"){
            correctToast()
            correct += 1
        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.yellow)
    }

    //Checks yellow answer
    private fun yellow(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "yellow"){
            correctToast()
            correct += 1
        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.green)
    }

    //Checks green answer
    private fun green(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "green"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.blue)
    }

    //Checks blue answer
    private fun blue(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "blue"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.purple)
    }

    //Checks purple answer
    private fun purple(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "purple"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.pig)
    }

    //Checks pink answer
    private fun pink(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "pink"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.white)
    }

    //Check white answer
    private fun white(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "pink"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.grey)
    }

    //Checks grey answer
    private fun grey(){
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "grey"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.brown)
    }

    //Checks brown answer
    private fun brown() {
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()
        val image = findViewById<ImageView>(R.id.playImg)

        if (answer == "brown"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        image.setImageResource(R.drawable.black)
    }

    //Checks black answer
    private fun black() {
        val text = findViewById<EditText>(R.id.textInput)
        val answer = text.text.toString()


        if (answer == "black"){
            correctToast()
            correct += 1

        }
        else {
            wrongToast()
        }

        scorePage()
    }

    //Takes user to the score page
    private fun scorePage(){
        var answer = "idk"

        when(correct){
            0 -> answer = "zero/eleven"
            1 -> answer = "one/eleven"
            2 -> answer = "two/eleven"
            3 -> answer = "three/eleven"
            4 -> answer = "four/eleven"
            5 -> answer = "five/eleven"
            6 -> answer = "six/eleven"
            7 -> answer = "seven/eleven"
            8 -> answer = "eight/eleven"
            9 -> answer = "nine/eleven"
            10 -> answer = "ten/eleven"
            11 -> answer = "eleven/eleven"
        }

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext,answer,duration)
        toast.show()
        intent = Intent(this, ScoreActivity::class.java)
        intent.putExtra("answer", answer)
        startActivity(intent)
    }

    //Function to play blop sound
    private fun playBlop() {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.blop)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
            mMediaPlayer = null
        }
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