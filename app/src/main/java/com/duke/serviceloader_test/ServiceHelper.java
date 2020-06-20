package com.duke.serviceloader_test;

import android.util.Log;

import com.duke.interfacelib.Display;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: duke
 * @DateTime: 2020-06-20 20:36
 * @Description:
 */
public class ServiceHelper {

    public static final String TAG = ServiceHelper.class.getName();

    public static void print() {
        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        Iterator<Display> iterator = loader.iterator();

        Log.e(TAG, "end");

        while (iterator.hasNext()) {
            Display d = iterator.next();
            Log.e(TAG, "next = " + d.getName());
        }

        Log.e(TAG, "end");
    }

}
