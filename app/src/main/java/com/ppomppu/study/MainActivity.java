package com.ppomppu.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ppomppu.study.databinding.ActivityCounterBinding;

public class MainActivity extends AppCompatActivity {


    private  int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCounterBinding binding = ActivityCounterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textviewCount.setText("0");

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