package com.ppomppu.study.viewmodels;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;


import com.ppomppu.study.databinding.ViewNormalTextBinding;


public class NormalViewHolder extends ViewHolder {
    private static final String TAG = "로그";
    private final ViewNormalTextBinding binding;
    public NormalViewHolder(@NonNull ViewNormalTextBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String s){
        Log.d(TAG, "NormalViewHolder::bind: ");
        Context context = binding.getRoot().getContext();
        // String sentAt = DateUtils.formatDateTime(context, message.getCreatedAt(), DateUtils.FORMAT_SHOW_TIME);
        binding.textView.setText(s);
        binding.textView.setTextSize(20);

    }
}
