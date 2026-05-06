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
        composable("Second" + "/{nombre/{pass}") {

            val name = it.arguments?.getString("nombre")
            val pass = it.arguments?.getString("Contraseña")
            if(pass=="1234" && name=="admin") {
                SScreen(navcontroller, name)
            }else{
                //mandar falla

                FailLogin(navcontroller)
            }
        }
    }
}