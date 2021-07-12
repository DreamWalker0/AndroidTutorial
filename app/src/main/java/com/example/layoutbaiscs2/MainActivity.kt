package com.example.layoutbaiscs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cyborg_signin.*
import kotlinx.android.synthetic.main.txt_view_experiment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * New way
         * using build.graddle(app)->plugins->id 'kotlin-android-extensions'
         * This autogenerate id in the xml
         * so not need to use findBYId
         */
        btnUplift.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val bloodType = etBloodType.text.toString()
            val cyborg = etCyborg.text.toString()
            Log.d("MainActivity", "$firstName $lastName, blood type $bloodType, is a cyborg? $cyborg")
        }

        //This is the old way
        //val btnYes = findViewById<Button>(R.id.btnYes)

        //Increase count button
//        var count = 0
//        btnPlusOne.setOnClickListener {
//            count++
//            tvCount.text = "Let's Count: $count"
//        }

        //todo 1. EDITTEXT
        //This adds 2 numbers

//        btnSum.setOnClickListener {
//            val firstNumber = etFirstNumber.text.toString().toInt()
//            val secondNumber = etSecondNumber.text.toString().toInt()
//            val result = firstNumber + secondNumber
//            tvResult.text = result.toString()
//        }


    }
}