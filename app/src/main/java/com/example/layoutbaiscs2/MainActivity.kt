//Author: Jorge Guzman Nader
//Date: 7/12/2021
//Info: Android Tutorial in Kotlin

package com.example.layoutbaiscs2

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.app.ActivityCompat
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

        //todo 6. Passing Data between Activities
//        //Uses register_planet.xml, PlanetActivity, activity_planet.xml
//        btnApply.setOnClickListener {
//            val name = etName.text.toString()
//            val age = etAge.text.toString().toInt()
//            val gravity = etGravity.text.toString().toDouble()
//            val planet = Planet(name,age, gravity)
//
//            Intent(this,PlanetActivity::class.java).also {
//
//                it.putExtra("EXTRA_PLANET",planet)
//                //with the implementation of planet this is not needed anymore
////                it.putExtra("EXTRA_NAME",name)
////                it.putExtra("EXTRA_AGE",age)
////                it.putExtra("EXTRA_GRAVITY",gravity)
//                startActivity(it)
//            }
//        }
        //todo 7. Permissions
        //Uses a Button, AndroidManifest.xml, functions below
//        btnRequestPermissions.setOnClickListener {
//            requestPermissions()
//        }




    }

    //Permissions
//    private fun hasWriteExternalStoragePermission() =
//        ActivityCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
//    private fun hasForegroundPermission() =
//        ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
//    private fun hasBackgroundPermission() =
//        ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED
//
//    //This function request the permissions
//    private fun requestPermissions(){
//        var permissionToRequest = mutableListOf<String>()
//        if (!hasWriteExternalStoragePermission()){
//            permissionToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//        }
//        if (!hasForegroundPermission()){
//            permissionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
//        }
////        if (!hasBackgroundPermission()){
////            permissionToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)}
//        if(!hasBackgroundPermission() && hasForegroundPermission()){
//        }
//        if (permissionToRequest.isNotEmpty()){
//            ActivityCompat.requestPermissions(this,permissionToRequest.toTypedArray(),0)
//        }
//
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == 0 && grantResults.isNotEmpty()){
//            for (i in grantResults.indices){
//                if (grantResults[i] == PackageManager.PERMISSION_GRANTED){
//                    Log.d("PermissionsRequest","${permissions[i]} granted")
//                }
//            }
//
//        }
//    }
}