package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.view.View
import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras
import java.nio.file.WatchEvent


@Composable

fun Actualizar( viewModel: MiIcono){
    val state=viewModel.miState
    Column (modifier = Modifier.fillMaxSize()){
        LazyColumn (modifier = Modifier.fillMaxSize().padding(16.dp)){
            items(state.items){
                Card(modifier = Modifier.fillMaxWidth().height(120.dp)) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(text = it.titulo)
                        Image(imageVector = it.icono, contentDescription = "icono")
                    }
                }
            }
            item {
                Button(onClick = {
                    viewModel.addItem()
                }){
                    Text(text ="agregar")
                }
            }
        }
    }
}

    class MiIcono:ViewModel(){
        var miState by mutableStateOf(Lista())
        fun addItem(){

            miState.items.add(MisDatos("Nuevos Elementos", Icons.Default.Build))
        }
    }
class Lista{
    val items = mutableStateListOf<MisDatos>(MisDatos("Lista", Icons.Default.AccountCircle))
}
    data class MisDatos(val titulo:String
                    , val icono: ImageVector
        )