package com.duke.serviceloader_test;

import android.util.Log;

import com.duke.interfacelib.DisplayA;
import com.duke.interfacelib.DisplayB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @Author: duke
 * @DateTime: 2020-06-20 20:36
 * @Description:
 */
public class ServiceHelper {

    public static final String TAG = ServiceHelper.class.getName();

    public static <T> List<T> getServices(final Class<T> interfaceClass) {
        final ServiceLoader<T> loader = ServiceLoader.load(interfaceClass);
        final Iterator<T> iterator = loader.iterator();
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t != null) {
                list.add(t);
            }
        }
        return list;
    }

    public static <T> T getService(final Class<T> interfaceClass) {
        final ServiceLoader<T> loader = ServiceLoader.load(interfaceClass);
        final Iterator<T> iterator = loader.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

//    public static void printA() {
//        DisplayA a = getService(DisplayA.class);
//        if (a == null) {
//            return;
//        }
//
//        Log.e(TAG, "start");
//
//        Log.e(TAG, "next = " + a.getName());
//
//        Log.e(TAG, "end");
//    }
//
//    public static void printB() {
//        DisplayB b = getService(DisplayB.class);
//        if (b == null) {
//            return;
//        }
//
//        Log.e(TAG, "start");
//
//        Log.e(TAG, "next = " + b.getName());
//
//        Log.e(TAG, "end");
//    }

}
