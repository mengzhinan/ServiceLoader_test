package com.duke.serviceloader_test

import java.util.*

/**
 * @Author: duke
 * @DateTime: 2020-06-20 20:36
 * @Description:
 */
object ServiceHelper {
    val TAG = ServiceHelper::class.java.name
    fun <T> getServices(interfaceClass: Class<T>?): List<T> {
        val loader = ServiceLoader.load(interfaceClass)
        val iterator: Iterator<T> = loader.iterator()
        val list: MutableList<T> = ArrayList()
        while (iterator.hasNext()) {
            val t: T? = iterator.next()
            if (t != null) {
                list.add(t)
            }
        }
        return list
    }

    fun <T> getService(interfaceClass: Class<T>?): T? {
        val loader = ServiceLoader.load(interfaceClass)
        val iterator: Iterator<T> = loader.iterator()
        return if (iterator.hasNext()) {
            iterator.next()
        } else null
    } //    public static void printA() {
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