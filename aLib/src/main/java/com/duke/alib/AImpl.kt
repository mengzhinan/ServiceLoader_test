package com.duke.alib

import android.util.Log
import com.duke.interfacelib.DisplayA

/**
 * @Author: duke
 * @DateTime: 2020-06-20 15:05
 * @Description:
 */
class AImpl : DisplayA {
    override val name: String
        get() = "a lib"

    init {
        Log.e("ServiceHelper", "AImpl()")
    }
}
