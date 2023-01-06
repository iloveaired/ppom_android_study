package com.ppomppu.android.viewmodels;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ppomppu.android.R;


public class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public ViewHolder(View v) {
        super(v);

        this.textView = v.findViewById(R.id.textView);
    }
    public TextView getTextView() {
        return textView;
    }


    public void onBindViewHolder(String s) {
        bind(s);
    }
    public void bind(String s) {}

}