package com.example.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//This is a comment
    private static final String TAG = "MainActivityTAG_";

    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
                Log.d(TAG, "handleMessage: " + msg.what);
                Log.d(TAG, "handleMessage: " + Thread.currentThread());
            }
        };

        MyThread myThread = new MyThread(mHandler);
        myThread.start();

        Log.d(TAG, "onCreate: " + Thread.currentThread());
    }
}
