package com.duke.alib;

import android.util.Log;

import com.duke.interfacelib.DisplayA;

/**
 * @Author: duke
 * @DateTime: 2020-06-20 15:05
 * @Description:
 */
public class AImpl implements DisplayA {

    public AImpl() {
        Log.e("ServiceHelper", "AImpl()");
    }

    @Override
    public String getName() {
        return "a lib";
    }
}
