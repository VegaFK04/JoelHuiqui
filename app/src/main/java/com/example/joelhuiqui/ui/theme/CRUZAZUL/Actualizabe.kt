package com.example.joelhuiqui.ui.theme.CRUZAZUL

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras

@Composable

fun Actualizar(){}

    class MiIcono:ViewModel(){
        var miState by mutableStateOf(Lista())
        fun addItem(){

            miState=miState.items.map { it.copy() + MisDatos("Nuevo Elemento")}
        }
    }

class Lista{
    val items = listOf<MisDatos>(MisDatos("Titulo", Icons.Default.AccountCircle))
}
    data class MisDatos(val titulo:String
                    , val icono: ImageVector
        )