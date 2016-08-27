package com.example.handler;

import android.util.Log;

/**
 * Created by evin on 8/26/16.
 */
public class MyThread extends Thread{
    private static final String TAG = "MyThreadTAG_";

    @Override
    public void run() {
        Log.d(TAG, "run: ");
    }
}
