package com.ppomppu.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.ppomppu.study.databinding.ActivityCounterBinding;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "로그";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCounterBinding binding = ActivityCounterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       final CounterViewModel viewModel =  new ViewModelProvider(this).get(CounterViewModel.class);

        binding.textviewCount.setText("0");
        Log.d(TAG, "MainActivity::onCreate: ");

        binding.fabAdd.setOnClickListener( v -> {
            viewModel.counter++;
            binding.textviewCount.setText(viewModel.counter+"");
        });

        binding.fabRemove.setOnClickListener( v -> {
            viewModel.counter--;
            binding.textviewCount.setText(viewModel.counter+"");
        });

    }
}