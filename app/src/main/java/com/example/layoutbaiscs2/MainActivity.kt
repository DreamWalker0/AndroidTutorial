package com.example.layoutbaiscs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

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

//        btnSum.setOnClickListener {
//            val firstNumber = etFirstNumber.text.toString().toInt()
//            val secondNumber = etSecondNumber.text.toString().toInt()
//            val result = firstNumber + secondNumber
//            tvResult.text = result.toString()
//        }

        //todo 2. IMAGEVIEW
        //This adds an image of a fancy cat when a button is clicked
//        btnAddImage.setOnClickListener {
//            ivImageCat.setImageResource(R.drawable.fancy_cat)
//        }

        // todo 3. CheckBox, RadioButton
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




    }
}