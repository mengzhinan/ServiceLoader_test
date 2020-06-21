package com.duke.blib

import android.util.Log
import com.duke.interfacelib.DisplayB

/**
 * @Author: duke
 * @DateTime: 2020-06-20 15:05
 * @Description:
 */
class BImpl : DisplayB {
    override val name: String
        get() = "b lib"

    init {
        Log.e("ServiceHelper", "BImpl()")
    }
}