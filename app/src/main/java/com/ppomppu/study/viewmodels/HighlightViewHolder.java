package com.ppomppu.study.viewmodels;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.Log;

import androidx.annotation.NonNull;

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
        Context context = binding.getRoot().getContext();
        // String sentAt = DateUtils.formatDateTime(context, message.getCreatedAt(), DateUtils.FORMAT_SHOW_TIME);
        binding.textView.setText(s);

    }
}
