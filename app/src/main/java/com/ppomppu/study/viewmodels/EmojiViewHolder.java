package com.ppomppu.study.viewmodels;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.DrawableUtils;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ppomppu.study.R;
import com.ppomppu.study.databinding.ViewEmojiTextBinding;
import com.ppomppu.study.databinding.ViewNormalTextBinding;


public class EmojiViewHolder extends ViewHolder {
    private static final String TAG = "로그";
    private final ViewEmojiTextBinding binding;
    public EmojiViewHolder(@NonNull ViewEmojiTextBinding binding) {

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
