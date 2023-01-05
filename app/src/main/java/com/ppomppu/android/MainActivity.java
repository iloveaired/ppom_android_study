package com.ppomppu.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "로그";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "MainActivity::onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}