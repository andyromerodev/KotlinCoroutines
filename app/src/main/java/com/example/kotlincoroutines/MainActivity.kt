package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val TAG: String = "ActividadPrincipal"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            Log.d(TAG, "Corriendo Corrutina en el subproceso: ${Thread.currentThread().name}")
            delay(1000L)
            Log.d(TAG, "Mundo!!")
        }
        Log.d(TAG, "Corriendo codigo en el subproceso: ${Thread.currentThread().name}")
        Log.d(TAG, "Hola")

    }
}