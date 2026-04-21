package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SensorAcel (context: Context): ViewModel(), SensorEventListener{
    //Sensor Manager

    val sensorManager= context.getSystemService(Context.SENSOR_SERVICE) as SensorManager

    //Sensor Distancia
    val distanciaSensor= sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

    //State para leer el sensor

    val accelX= mutableStateOf(0f)
    val accelY= mutableStateOf(0f)
    val accelZ= mutableStateOf(0f)

    val posx=mutableStateOf(0f)
    val posy=mutableStateOf(0f)

         //Constructor
    init {
        //registrar el listener
        distanciaSensor.also {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }


    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {}

    override fun onSensorChanged(event: SensorEvent?) {
        event.let {
            accelX.value= it!!.values[0]
            accelY.value= it!!.values[1]
            accelZ.value= it!!.values[2]

            posx.value+=it!!.values[0]
            posy.value+=it!!.values[0]

        }
    }
    fun unregister(){
        sensorManager.unregisterListener(this)
    }
}