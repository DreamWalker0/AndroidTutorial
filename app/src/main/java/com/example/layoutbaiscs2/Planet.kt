package com.example.layoutbaiscs2

import java.io.Serializable

//Data classes hold data
//Serializable is needed to use the putExtra function
data class Planet (
    val name: String,
    val age: Int,
    val gravity: Double
    ) : Serializable