package com.ppomppu.study.viewmodels;

import android.util.Log;

import androidx.annotation.NonNull;

import com.ppomppu.study.databinding.ViewItemLoadingBinding;


public class LoadingBaseViewHolder extends BaseViewHolder {
    private static final String TAG = "로그";
    private final ViewItemLoadingBinding binding;
    public LoadingBaseViewHolder(@NonNull ViewItemLoadingBinding binding) {

        super(binding.getRoot());

        this.binding = binding;
    }

    public void bind(String s){

        Log.d(TAG, "LoadingViewHolder::bind: ");


    }
}
