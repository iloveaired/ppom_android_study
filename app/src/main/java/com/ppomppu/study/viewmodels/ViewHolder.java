package com.ppomppu.study.viewmodels;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ppomppu.study.R;


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