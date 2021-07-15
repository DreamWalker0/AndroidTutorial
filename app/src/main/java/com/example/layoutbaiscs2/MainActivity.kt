//Author: Jorge Guzman Nader
//Date: 7/12/2021
//Info: Android Tutorial in Kotlin

package com.example.layoutbaiscs2

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
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

        //todo 1. EditText
        //This adds 2 numbers
        //Uses add_numbers.xml

//        btnSum.setOnClickListener {
//            val firstNumber = etFirstNumber.text.toString().toInt()
//            val secondNumber = etSecondNumber.text.toString().toInt()
//            val result = firstNumber + secondNumber
//            tvResult.text = result.toString()
//        }

        //todo 2. ImageView
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

        //todo 8. Implicit Intents
        //Uses choose_image.xml , functions below
        //This allows to chose a picture from gallery and other places
//        btnTakePhoto.setOnClickListener {
//            Intent(Intent.ACTION_GET_CONTENT).also {
//                //image/* looks for all image
//                //another example could be image/png
//                it.type = "image/*"
//                startActivityForResult(it,0)
//            }
//        }

        // todo 9. Alert Dialog
        //Refer to alert_dialog_buttons
        //For adding contacts alert dialog
//        val addContactDialog = AlertDialog.Builder(this)
//            .setTitle("Add Contact")
//            .setMessage("Do you want to add Pyramid Head to your contacts list?")
//            .setIcon(R.drawable.ic_add_contact_dark)
//            .setPositiveButton("Yes"){_, _ ->
//                Toast.makeText(this, "You added Pyramid Head to your contacts list", Toast.LENGTH_SHORT).show()
//
//            }
//            .setNegativeButton("No"){_, _ ->
//                Toast.makeText(this, "You didn't add Pyramid Head to your contacts list", Toast.LENGTH_SHORT).show()
//
//            }.create()
//
//        //When clicked button 1
//        btnDialog1.setOnClickListener {
//            addContactDialog.show()
//        }
//
//        //For one choice alert dialog
//        val options = arrayOf("Past", "Present", "Future")
//        val singleChoiceDialog = AlertDialog.Builder(this)
//            .setTitle("Choose one of these options")
//            .setSingleChoiceItems(options,0){dialogInterface, i ->
//                Toast.makeText(this,"You have accepted your destination to be ${options[i]}", Toast.LENGTH_SHORT).show()
//            }
//            .setPositiveButton("Accept"){_, _ ->
//                Toast.makeText(this, "You accepted to travel to the unknown", Toast.LENGTH_SHORT).show()
//
//            }
//            .setNegativeButton("Decline"){_, _ ->
//                Toast.makeText(this, "You declined to explore the unknown", Toast.LENGTH_SHORT).show()
//
//            }.create()
//
//        btnDialog2.setOnClickListener {
//            singleChoiceDialog.show()
//        }
//
//        //For multi-choice alert dialog
//        val multiChoiceDialog = AlertDialog.Builder(this)
//            .setTitle("Choose one of these options")
//                //Initialize the 3 of the options to false so they are unchecked
//            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_, i, isChecked ->
//                if (isChecked){
//                    Toast.makeText(this, "You selected ${options[i]}",Toast.LENGTH_SHORT).show()
//                } else{
//                    Toast.makeText(this, "You eliminated ${options[i]}",Toast.LENGTH_SHORT).show()
//                }
//
//            }
//            .setPositiveButton("Accept"){_, _ ->
//                Toast.makeText(this, "You accepted to travel to the multiverse", Toast.LENGTH_SHORT).show()
//
//            }
//            .setNegativeButton("Decline"){_, _ ->
//                Toast.makeText(this, "You declined to explore the multiverse", Toast.LENGTH_SHORT).show()
//
//            }.create()
//
//        btnDialog3.setOnClickListener {
//            multiChoiceDialog.show()
//        }

        //todo 10. Spinner
        //Refer to months inside strings.xml, spinner_experiment.xml

        //Creates an spinner and select the items in it
//        val customList = listOf("Fire","Water","Air","Earth")
//        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,customList)
//        spMonths.adapter = adapter
//
//
//        //This displays selected months in a message
//        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {//using this@MainActivity because if using just "this" will refer to AdapterView
//                Toast.makeText(this@MainActivity,
//                    "You selected ${parent?.getItemAtPosition(position).toString()}",
//                    Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//
//            }
//        }

        //todo 11.RecyclerView
        //uses 'implementation 'androidx.recyclerview:recyclerview 1.1.0'
        //inside build.gradle(module:LayoutBasics.app)
        //Refer to item_todo.xml, recyclerview_experiment.xml, TodoAdapter.kt, T/odo.kt

//        var todoList = mutableListOf(
//            Todo("Eat vegetables",true),
//            Todo("Rise an army",false),
//            Todo("Ponder",false),
//            Todo("Try",false),
//            Todo("Fail",false),
//            Todo("Try again",false),
//            Todo("Fail again",false),
//            Todo("Try until you get it",false)
//        )
//        val adapter = TodoAdapter(todoList)
//        rvTodos.adapter = adapter
//        rvTodos.layoutManager =LinearLayoutManager(this)
//
//        btnTodo.setOnClickListener {
//            val title = etTodo.text.toString()
//            val todo = Todo(title,false)
//            todoList.add(todo)
//            //for update recyclerView
//            adapter.notifyItemInserted(todoList.size - 1)
//        }

        //todo 12. Fragments
//        //refer to fragment_ui , fragment_first, fragment_second, FirstFragment, SecondFragment
//        val firstFragment = FistFragment()
//        val secondFragment = SecondFragment()
//
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment,firstFragment)
//            commit()
//        }
//
//        btnFragment1.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment,firstFragment)
//                //addToBackStack(null) is important so when click in back the app don't just exit
//                addToBackStack(null)
//                commit()
//            }
//        }
//
//        btnFragment2.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment,secondFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }

        //todo 13. Scope Functions
        //let: Used to check nulls, also better than simple null check in multi-threading case
//        var number:Int? = null
//        number?.let{
//            val newNumber = it + 1
//            //This will be the type of the number, ex.Int
//            newNumber
//        }
//        //assigning variable using let, to x = 3
//        var x = number?.let{
//            val newNumber = it + 1
//            //This will be the type of the number, ex.Int
//            newNumber
//        } ?: 3
//
//        //also:let you do additional things in functions and the like
//        var item = 0
//        fun getSquared() = ( item * item ).also {
//            item++
//        }
//
//        //apply:Used to modify object without need to call the variables every time
//        //It returns the object
//        //ex. person.name, just call name instead
//        var intent = Intent().apply {
//            putExtra("","")
//            action = ""
//        }
//
//        //run:Similar to apply but will return the last line instead of the object Intent()
//        var intent2 = Intent().run {
//            putExtra("","")
//            action = ""
//            this
//        }
//
//        //with: similar to run
//        with(Intent()){}

        //todo 14. Bottom Navigation View
        //Refer to bottom_nav_menu , bottom_nav_view, bottom_fragment1..3, BottomFirst...ThirdFragment
//        val firstFragment = BottomFirstFragment()
//        val secondFragment = BottomSecondFragment()
//        val thirdFragment = BottomThirdFragment()
//
//        setCurrentFragment(firstFragment)
//
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.miHome -> setCurrentFragment(firstFragment)
//                R.id.miMessages -> setCurrentFragment(secondFragment)
//                R.id.miProfile -> setCurrentFragment(thirdFragment)
//            }
//            true
//        }
//
//        //For display number of notifications over icons
//        bottomNavigationView.getOrCreateBadge(R.id.miMessages).apply {
//            number = 1000000
//            isVisible = true
//        }








    //END OnCreate
    }

    //14 Bottom Navigation View
//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment,fragment)
//            commit()
//        }

        //todo 15. Toolbar Menu
//        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//            menuInflater.inflate(R.menu.app_bar_menu,menu)
//            return true
//        }
//
//        //This allows the use of the menu icons
//        override fun onOptionsItemSelected(item: MenuItem): Boolean {
//            when(item.itemId){
//                R.id.miAddContact -> Toast.makeText(this,"You Clicked on Add Contact", Toast.LENGTH_SHORT).show()
//                R.id.miFavorites -> Toast.makeText(this,"You Clicked on Favorites", Toast.LENGTH_SHORT).show()
//                R.id.miSettings -> Toast.makeText(this,"You Clicked on Settings", Toast.LENGTH_SHORT).show()
//                R.id.miClose -> finish()
//                R.id.miFeedback -> Toast.makeText(this,"You Clicked on Feedback", Toast.LENGTH_SHORT).show()
//            }
//            return true
//        }











    //8. Implicit Intents
//    override fun onActivityResult(requestCode: Int, resultCode: Int, thisData: Intent?) {
//        super.onActivityResult(requestCode, resultCode, thisData)
//        if (resultCode == Activity.RESULT_OK && requestCode == 0){
//            val uri = thisData?.data
//            ivPhoto.setImageURI(uri)
//        }
//
//    }

    //7.Permissions
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

//END Main
}