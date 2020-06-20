package com.duke.serviceloader_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.duke.interfacelib.Base
import com.duke.interfacelib.DisplayA
import com.duke.interfacelib.DisplayB

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onResume() {
        super.onResume()

//        var baseInterface: Base? = null;
//
//        if(1){
//            baseInterface = ServiceHelper.getService(DisplayA::class.java)
//        }else if(2){
//            baseInterface = ServiceHelper.getService(DisplayB::class.java)
//        }
//
//        baseInterface?.name


    }
}