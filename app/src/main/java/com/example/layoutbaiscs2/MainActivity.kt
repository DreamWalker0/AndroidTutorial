//Author: Jorge Guzman Nader
//Date: 7/12/2021
//Info: Android Tutorial in Kotlin

package com.example.layoutbaiscs2

import android.Manifest
import android.app.*
import android.content.*
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.*
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.costume_toast.*
import kotlinx.android.synthetic.main.drag_drop.*
import kotlinx.android.synthetic.main.drawer_layout_manu.*
import kotlinx.android.synthetic.main.intent_service_sample.*
import kotlinx.android.synthetic.main.intent_service_sample.btnStartService
import kotlinx.android.synthetic.main.intent_service_sample.btnStopService
import kotlinx.android.synthetic.main.intent_service_sample.tvServiceInfo
import kotlinx.android.synthetic.main.notifications_example.*
import kotlinx.android.synthetic.main.service_sample.*
import kotlinx.android.synthetic.main.share_data_layout.*

class MainActivity : AppCompatActivity() {

    //17.Slidable menu with Navigation Drawer
    lateinit var toggle: ActionBarDrawerToggle

    //19. Notifications
    val CHANNEL_ID = "channelID"
    val CHANNEL_NAME = "channelName"
    val  NOTIFICATION_ID = 0

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

        //todo 15. Swipable View using ViewPager2
        //Refer to view_pager2_example, item_view_pager, ViewPagerAdapter

        //list of image resources
//        val images = listOf(
//            R.drawable.fancy_cat,
//            R.drawable.fancy_cat2,
//            R.drawable.fancy_cat3,
//            R.drawable.fancy_cat4,
//            R.drawable.fancy_cat5
//        )
//
//        val adapter = ViewPagerAdapter(images)
//        viewPager.adapter = adapter
//
//        //For change orientation of swipe
//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        //Automatic swiping - Does not work
//        viewPager.beginFakeDrag()
//        viewPager.fakeDragBy(-10f)
//        viewPager.endFakeDrag()

        //todo 16. Tab layout in ViewPager2
        //Refer to view_pager2_tabs
        //Refer to view_pager2_example, item_view_pager, ViewPagerAdapter
        //needs a LinerLayout in the xml

        //list of image resources
//        val images = listOf(
//            R.drawable.fancy_cat,
//            R.drawable.fancy_cat2,
//            R.drawable.fancy_cat3,
//            R.drawable.fancy_cat4,
//            R.drawable.fancy_cat5
//        )
//
//        val adapter = ViewPagerAdapter(images)
//        viewPager.adapter = adapter
//
//        //For change orientation of swipe
//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
//
//        //position starts at 0 that is why use +1
//        TabLayoutMediator(tabLayout1,viewPager){tab, position->
//            tab.text = "Tab ${position + 1}"
//        }.attach()
//
//        //respond to events, message when selecting tabs
//        tabLayout1.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainActivity,"Reselected ${tab?.text}", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainActivity,"Unselected ${tab?.text}", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                Toast.makeText(this@MainActivity,"Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
//            }
//        })

        //todo 17. Slidable menu with Navigation Drawer
        //refer to drawer_layout_menu, nav_header, nav_drawer_menu, function onOptionsItemSelected
        //On the top of the Main uses: lateinit var toggle: ActionBarDrawerToggle
        //R.string.open, R.string.close used for read-out-load if person can't see well, implementation is on the string.xml
//        toggle  = ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close)
//
//        drawerlayout.addDrawerListener(toggle)
//        //This tell toggle that is ready to be used
//        toggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        //Respond to menu item clicks
//        navView.setNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.miItem1 -> Toast.makeText(applicationContext,"Clicked item 1", Toast.LENGTH_SHORT).show()
//                R.id.miItem2 -> Toast.makeText(applicationContext,"Clicked item 2", Toast.LENGTH_SHORT).show()
//                R.id.miItem3 -> Toast.makeText(applicationContext,"Clicked item 3", Toast.LENGTH_SHORT).show()
//            }
//            true
//        }

        //todo 18. Saving data in shared preferences
        //refer to shared_data_layout
        //This allows to save small amounts of data and load it by clicking a button
//        val sharedPref = getSharedPreferences("My Preferences", MODE_PRIVATE)
//        val editor = sharedPref.edit()
//
//        //btn listener, for values that will be saved
//        btnSave.setOnClickListener {
//            val name = etName.text.toString()
//            val age = etAge.text.toString().toInt()
//            val isAdult = cbAdult.isChecked
//
//            editor.apply {
//                //putString() uses a key, value format
//                putString("name", name)
//                putInt("age", age)
//                putBoolean("isAdult", isAdult)
//                //finish the data, commit() does the same but can block main thread
//                apply()
//            }
//        }
//
//        //This button read the data
//        btnLoad.setOnClickListener {
//            //this gets a key, default value
//            val name = sharedPref.getString("name", null)
//            val age = sharedPref.getInt("age", 0)
//            val isAdult = sharedPref.getBoolean("isAdult",false)
//
//            //setters display the value
//            etName.setText(name)
//            etAge.setText(age.toString())
//            cbAdult.isChecked = isAdult
//        }


        //todo 19. Notifications
        //refer to notifications_example, fun createNotificationChannel()
        //call function to create a notification channel
//        createNotificationChannel()
//
//        //For being able to access app by clicking on the notification
//        val intent = Intent(this,MainActivity::class.java)
//        val pendingIntent = TaskStackBuilder.create(this).run {
//            addNextIntentWithParentStack(intent)
//            getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT)
//        }
//
//        val notification = NotificationCompat.Builder(this,CHANNEL_ID)
//            .setContentTitle("Interesting Notification")
//            .setContentText("This is the content text")
//            .setSmallIcon(R.drawable.ic_eye)
//            .setPriority(NotificationCompat.PRIORITY_HIGH)
//            .setContentIntent(pendingIntent)
//            .build()
//
//        val notificationManager = NotificationManagerCompat.from(this)
//
//        //For showing the notification by clicking the button
//        btnShowNotification.setOnClickListener {
//            notificationManager.notify(NOTIFICATION_ID,notification)
//        }

        //todo 20. Intent Service
        //refer to intent_service_sample, class MyIntentService.kt added <service> to AndroidManifest.xml
        //App works even if minimized

//        btnStartService.setOnClickListener {
//            Intent(this, MyIntentService::class.java).also {
//                startService(it)
//                tvServiceInfo.text = "Service running"
//            }
//        }
//
//        btnStopService.setOnClickListener {
//            MyIntentService.stopService()
//            tvServiceInfo.text = "Service stopped"
//        }

        //todo 21. Services
        //refer to service_sample, class MyService

//        btnStartService.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                startService(it)
//                tvServiceInfo.text = "Service running"
//            }
//        }
//
//        btnStopService.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                stopService(it)
//                tvServiceInfo.text = "Service stopped"
//            }
//        }
//
//        btnSendData.setOnClickListener {
//            Intent(this, MyService::class.java).also {
//                val dataString = etData.text.toString()
//                it.putExtra("EXTRA_DATA", dataString)
//                startService(it)
//
//            }
//        }

        //todo 22. Drag and Drop
        //refer to drag_drop


        //this create the button listener
//        llTop.setOnDragListener(dragListener)
//        llBottom.setOnDragListener(dragListener)
//
//
//        dragView.setOnLongClickListener {
//            val clipText = "This is the ClipData text"
//            val item = ClipData.Item(clipText)
//            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
//            val data = ClipData(clipText, mimeTypes, item)
//
//            val dragShadowBuilder = View.DragShadowBuilder(it)
//            it.startDragAndDrop(data, dragShadowBuilder, it, 0)
//
//            it.visibility = View.INVISIBLE
//            true
//        }

        //todo 23. Broadcast Receivers
        //refer to class AirPlaneModeChangedReceiver
        //Shows a message when airplane mode is enabled or disabled

//        receiver = AirPlaneModeChangedReceiver()
//
//        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
//            registerReceiver(receiver,it)
//        }



    //END OnCreate
    }


    //23. Broadcast Receivers
    //This is needed to prevent a memory leak

//    lateinit var receiver: AirPlaneModeChangedReceiver
//
//    override fun onStop() {
//        super.onStop()
//        unregisterReceiver(receiver)
//    }

    //22. Drag and Drop
//    val dragListener = View.OnDragListener { view, event ->
//        when(event.action){
//            DragEvent.ACTION_DRAG_STARTED -> {
//                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
//            }
//            DragEvent.ACTION_DRAG_ENTERED -> {
//                view.invalidate()
//                true
//            }
//            DragEvent.ACTION_DRAG_LOCATION -> true
//            DragEvent.ACTION_DRAG_EXITED -> {
//                view.invalidate()
//                true
//            }
//            DragEvent.ACTION_DROP -> {
//                val item = event.clipData.getItemAt(0)
//                val dragData = item.text
//                Toast.makeText(this,dragData, Toast.LENGTH_SHORT).show()
//
//                view.invalidate()
//
//                val v = event.localState as View
//                val owner = v.parent as ViewGroup
//                owner.removeView(v)
//                val destination = view as LinearLayout
//                destination.addView(v)
//                v.visibility = View.VISIBLE
//                true
//            }
//            DragEvent.ACTION_DRAG_ENDED -> {
//                view.invalidate()
//                true
//            }
//            else -> false
//
//        }
//    }

    //19. Notifications
//    fun createNotificationChannel(){
//        //Build.VERSION_CODES.O is for android Oreo to check if the app is running in android Oreo or later
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            //create channel, IMPORTANCE_HIGH means the notification will have sound
//            val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME,
//                NotificationManager.IMPORTANCE_HIGH).apply {
//                //this changes the LED light color!!!!
//                lightColor = Color.GREEN
//                enableLights(true)
//
//            }
//            //Cast as NotificationManager
//            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            manager.createNotificationChannel(channel)
//
//        }
//    }



    // 17. Slidable menu with Navigation Drawer
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (toggle.onOptionsItemSelected(item)){
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }

    //14 Bottom Navigation View
//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment,fragment)
//            commit()
//        }

        //todo 24. Toolbar Menu
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