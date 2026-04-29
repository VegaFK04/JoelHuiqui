package com.example.joelhuiqui.ui.theme.CRUZAZUL

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navegacoin() {
    val navcontroller = rememberNavController()
    NavHost(navcontroller, "main")
    {

        composable("main") { MainScreen(navcontroller) }
        composable("Second" + "/{nombre") {
            val name = it.arguments?.getString("nombre")
            SScreen(navcontroller, name)

        }
    }
}