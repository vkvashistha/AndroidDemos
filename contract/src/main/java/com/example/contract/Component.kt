package com.example.contract

import androidx.navigation.NavController

interface Component {
    fun launchComponentInNewScreen(controller : NavController)
}