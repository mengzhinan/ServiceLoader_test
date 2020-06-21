package com.duke.serviceloader_test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.duke.interfacelib.DisplayA
import com.duke.interfacelib.DisplayB

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onResume() {
        super.onResume()


        val baseInterface1 = ServiceHelper.getService(DisplayA::class.java)
        if (baseInterface1 != null) {
            Log.e("ServiceHelper", "str = ${baseInterface1.name}")
        }
        val baseInterface2 = ServiceHelper.getService(DisplayB::class.java)
        if (baseInterface2 != null) {
            Log.e("ServiceHelper", "str = ${baseInterface2.name}")
        }

    }
}
