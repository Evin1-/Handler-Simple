package com.example.handler;

import android.os.Handler;
import android.util.Log;

/**
 * Created by evin on 8/26/16.
 */
public class MyThread extends Thread {
    private static final String TAG = "MyThreadTAG_";

    private Handler mHandler;

    public MyThread(Handler handler) {
        mHandler = handler;
    }

    @Override
    public void run() {
        Log.d(TAG, "run: " + Thread.currentThread());
        mHandler.sendEmptyMessage(1);
    }
}
