package com.example.layoutbaiscs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_planet.*

class PlanetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet)

        //as is for casting to type Planet class
        val planet =intent.getSerializableExtra("EXTRA_PLANET") as Planet
        tvPlanet.text = planet.toString()

        //With the implementation of the data class Planet this is not needed
//        val name = intent.getStringExtra("EXTRA_NAME")
//        //needs to provide a default value in Int, ex.0
//        val age = intent.getIntExtra("EXTRA_AGE",0)
//        val gravity = intent.getDoubleExtra("EXTRA_GRAVITY",0.0)
        //This passes the string to a variable to later be extracted and used in a TextView
//        val planetString = "You registered a planet named $name, that is $age years old, with a gravitational force of $gravity g"
//        tvPlanet.text = planetString
    }
}