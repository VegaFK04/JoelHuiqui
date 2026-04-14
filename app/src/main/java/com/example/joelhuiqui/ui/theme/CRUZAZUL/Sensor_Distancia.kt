package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Sensor_Distancia(contexto: Context): ViewModel(), SensorEventListener {
    val sensorManager= contexto.getSystemService(Context.SENSOR_SERVICE) as SensorManager

    val distanciaSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY)

    val distancia= mutableStateOf(0f)

    init{
        distanciaSensor?.also {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not yet implemented")
    }

    override fun onSensorChanged(event: SensorEvent?) {
        event.let {
            distancia.value=it!!.values[0]
        }

    }


}