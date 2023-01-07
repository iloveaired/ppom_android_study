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
        CounterViewModel viewModel =  new ViewModelProvider(this).get(CounterViewModel.class);

        binding.fabAdd.setOnClickListener( v ->  viewModel.inc());
        binding.fabRemove.setOnClickListener( v ->  viewModel.dec());

        viewModel.counter.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.textviewCount.setText(integer+"");
            }
        });
    }
}