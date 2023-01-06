package com.ppomppu.study.viewmodels;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.ppomppu.study.R;
import com.ppomppu.study.databinding.ViewEmojiTextBinding;


public class EmojiBaseViewHolder extends BaseViewHolder {
    private static final String TAG = "로그";
    private final ViewEmojiTextBinding binding;
    public EmojiBaseViewHolder(@NonNull ViewEmojiTextBinding binding) {

        super(binding.getRoot());

        this.binding = binding;
    }

    public void bind(String s){
        Log.d(TAG, "EmojiViewHolder::bind: ");
        binding.textView.setText(s);
        binding.textView.setTextSize(20);
        String emojiUrl = "https://cdn.ppomppu.co.kr/images/emoticon/set05_03.png";
        Context context = binding.getRoot().getContext();


        Glide.with(context)
                .load(emojiUrl)
                .error(R.drawable.ic_launcher_background)
                .into(binding.imageEmoji);

    }
}
