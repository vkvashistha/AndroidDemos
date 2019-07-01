package com.example.componentmodule

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import com.example.contract.Component

class ComponentImpl(val context : Context, val fragmentManager : FragmentManager, val containerId : Int) : Component {
    override fun launchComponentInNewScreen(controller: NavController) {
        val graph = controller.navInflater.inflate(R.navigation.component_navigation)
        controller.graph.addAll(graph)
        controller.navigate(graph.startDestination)
    }
}