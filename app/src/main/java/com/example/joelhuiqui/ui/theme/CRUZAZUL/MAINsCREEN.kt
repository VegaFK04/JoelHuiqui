package com.example.joelhuiqui.ui.theme.CRUZAZUL

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    var tf_state by remember { mutableStateOf("") }
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        TextField(value = tf_state, onValueChange = {tf_state=it}, label = {Text("nombre")})

        Text("contenido principal")
        Button(onClick = {navController.navigate("Second" + "/${tf_state.toString()}")}) {
            Text("Saludar")
        }
    }
}