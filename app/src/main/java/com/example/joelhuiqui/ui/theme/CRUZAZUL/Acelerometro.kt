package com.example.joelhuiqui.ui.theme.CRUZAZUL

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.lifecycle.ViewModel

class Acelerometro(contexto: Context): ViewModel(), SensorEventListener {
val sensormanager = contexto.getSystemService(Context.SENSOR_SERVICE) as SensorManager

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {

    }
}

