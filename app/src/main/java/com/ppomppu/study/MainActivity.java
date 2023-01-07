package com.ppomppu.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import com.ppomppu.study.databinding.ActivityCounterBinding;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCounterBinding binding = ActivityCounterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.setLifecycleOwner(this);
        CounterViewModel viewModel =  new ViewModelProvider(this).get(CounterViewModel.class);

        binding.setViewModel(viewModel);

//        binding.fabAdd.setOnClickListener( v ->  viewModel.inc());
//        binding.fabRemove.setOnClickListener( v ->  viewModel.dec());


    }
}