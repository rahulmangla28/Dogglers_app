package com.genius_koder.dogglers_app

import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age: String,
    val hobbies: String
)

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.tzeitel,
            "Tzeitel",
            "7",
            "sunbathing"
        ),
        Dog(
            R.drawable.leroy,
            "Leroy",
            "4",
            "sleeping in dangerous places"
        ),
        Dog(
            R.drawable.frankie,
            "Frankie",
            "2",
            "stealing socks"
        ),
        Dog(
            R.drawable.nox,
            "Nox",
            "8",
            "meeting new animals"
        ),
        Dog(
            R.drawable.faye,
            "Faye",
            "8",
            "Digging in the garden"
        ),
        Dog(
            R.drawable.bella,
            "Bella",
            "14",
            "Chasing sea foam"
        )
    )
}