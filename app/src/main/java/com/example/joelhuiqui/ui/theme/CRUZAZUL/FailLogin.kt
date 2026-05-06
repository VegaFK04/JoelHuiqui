package com.example.joelhuiqui.ui.theme.CRUZAZUL

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FailLogin (navController: NavController){

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Usuario no Autorizado")
        Button(modifier = Modifier.fillMaxWidth(), onClick = {
            navController.navigate("main")
        }) { 
            Text("Regresar a Login")
        }
    }

}