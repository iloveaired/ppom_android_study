package com.ppomppu.study.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.ppomppu.study.databinding.ViewEmojiTextBinding;
import com.ppomppu.study.databinding.ViewHighlightTextBinding;

import com.ppomppu.study.R;
import com.ppomppu.study.databinding.ViewHighlightTextBinding;
import com.ppomppu.study.databinding.ViewNormalTextBinding;
import com.ppomppu.study.viewmodels.EmojiViewHolder;
import com.ppomppu.study.viewmodels.HighlightViewHolder;
import com.ppomppu.study.viewmodels.NormalViewHolder;
import com.ppomppu.study.viewmodels.ViewHolder;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

    private static final String TAG = "로그";
    private String[] mDataset;

    public MyAdapter(String[] myDataset) {

        mDataset = myDataset;
    }





    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "MyAdapter::onCreateViewHolder: ");


        if (viewType == 0){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new HighlightViewHolder(ViewHighlightTextBinding.inflate(inflater,parent,false ));
        } else {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new EmojiViewHolder(ViewEmojiTextBinding.inflate(inflater,parent,false ));
        }


    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
       //    holder.getTextView().setText(mDataset[position]);
        Log.d(TAG, "Element " + mDataset[position]);
        holder.onBindViewHolder(mDataset[position]);

    }

    @Override
    public int getItemViewType(int position) {
        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        return position % 2 * 2;
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}