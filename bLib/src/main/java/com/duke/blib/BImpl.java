package com.duke.blib;

import android.util.Log;

import com.duke.interfacelib.DisplayB;

/**
 * @Author: duke
 * @DateTime: 2020-06-20 15:05
 * @Description:
 */
public class BImpl implements DisplayB {

    public BImpl() {
        Log.e("ServiceHelper", "BImpl()");
    }

    @Override
    public String getName() {
        return "b lib";
    }

}
