package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Sensor_temperatura(contexto : Context): ViewModel(), SensorEventListener{
    val sensorManager= contexto.getSystemService(Context.SENSOR_SERVICE) as SensorManager
    val  temppsentor= sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)
    val temperatura = mutableStateOf(0f)
    init{
        temppsentor.also {
            sensorManager.registerListener(this,it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }
    override fun onSensorChanged(p0: SensorEvent?) {
        p0.let {
            temperatura.value=p0!!.values[0]
        }
    }

}