//Author: Jorge Guzman Nader
//Date: 7/12/2021
//Info: Android Tutorial in Kotlin

package com.example.layoutbaiscs2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.costume_toast.*

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
//        btnUplift.setOnClickListener {
//            val firstName = etFirstName.text.toString()
//            val lastName = etLastName.text.toString()
//            val bloodType = etBloodType.text.toString()
//            val cyborg = etCyborg.text.toString()
//            Log.d("MainActivity", "$firstName $lastName, blood type $bloodType, is a cyborg? $cyborg")
//        }

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
        //Uses add_numbers.xml

//        btnSum.setOnClickListener {
//            val firstNumber = etFirstNumber.text.toString().toInt()
//            val secondNumber = etSecondNumber.text.toString().toInt()
//            val result = firstNumber + secondNumber
//            tvResult.text = result.toString()
//        }

        //todo 2. IMAGEVIEW
        //Uses add_image.xml
        //This adds an image of a fancy cat when a button is clicked

//        btnAddImage.setOnClickListener {
//            ivImageCat.setImageResource(R.drawable.fancy_cat)
//        }

        //todo 3. CheckBox, RadioButton
        //Uses burger.xml
        //When you click the button ingredients of burger get displayed

//        btnOrder.setOnClickListener {
//            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
//            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
//            val cheese = cbCheese.isChecked
//            val onions = cbOnions.isChecked
//            val pepper = cbPepper.isChecked
//            //This gets all the checked boxes
//            val orderString = "You ordered a burger with:\n" +
//                    "${meat.text}" +
//                    (if(cheese)"\nCheese" else "") +
//                    (if (onions)"\nOnions" else "") +
//                    (if (pepper)"\nPeppers" else "")
//            //The content of orderString is assigned to appear in the TextView tvOrder
//            tvOrder.text = orderString
//        }

        //todo 4. Toasts, Context
        //Uses toast_button.xml, costume_toast.xlm

//        btnShowToast.setOnClickListener {
//            Toast.makeText(this,"The cake is a Lie!",Toast.LENGTH_LONG).show()
//        }
        //Costume Toast
//        btnShowToast.setOnClickListener {
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                view = layoutInflater.inflate(R.layout.costume_toast,clToast)
//                show()
//            }
//
//        }

        //todo 5. Intent, Starting Activities
        //Uses AndroidManifest.xml, activity_open.xml, activity_second.xml, SecondActivity, activity_third.xml, ThirdActivity
        //This code teaches how to transition between windows with a button click
        //Use "this" for context

//        btnOpenActivity.setOnClickListener {
//            Intent(this,SecondActivity::class.java).also {
//                startActivity(it)
//            }
//        }




    }
}