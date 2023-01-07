package com.ppomppu.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.ppomppu.study.databinding.ActivityCounterBinding;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "로그";
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCounterBinding binding = ActivityCounterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.textviewCount.setText(counter + "");
        Log.d(TAG, "MainActivity::onCreate: ");

        binding.fabAdd.setOnClickListener( v -> {
            counter++;
            binding.textviewCount.setText(counter+"");
        });

        binding.fabRemove.setOnClickListener( v -> {
            counter--;
            binding.textviewCount.setText(counter+"");
        });

    }
}