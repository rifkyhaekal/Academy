package com.example.haekalacademy.utils

import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResources {
    private const val RESOURCE = "GLOBAL"
    val idlilingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        idlilingResource.increment()
    }

    fun decrement() {
        idlilingResource.decrement()
    }


}