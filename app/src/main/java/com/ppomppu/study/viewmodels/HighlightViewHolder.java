package com.ppomppu.study.viewmodels;

import android.util.Log;

import androidx.annotation.NonNull;

import com.ppomppu.study.databinding.ViewHighlightTextBinding;
import com.ppomppu.study.databinding.ViewHighlightTextBinding;


public class HighlightViewHolder extends ViewHolder {
    private static final String TAG = "로그";
    private final ViewHighlightTextBinding binding;
    public HighlightViewHolder(@NonNull ViewHighlightTextBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String s){
        Log.d(TAG, "HighlightViewHolder::bind: ");
    }

//    private final ViewHighligh binding;
//
//    public HighlightMessageMeViewHolder(@NonNull ViewHighlightMessageMeHolderBinding binding) {
//        super(binding.getRoot());
//        this.binding = binding;
//    }


}
