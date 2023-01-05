package com.ppomppu.android.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ppomppu.android.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private static final String TAG = "로그";
    private String[] mDataset;

    public MyAdapter(String[] myDataset) {

        mDataset = myDataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View v) {
            super(v);

            this.textView = v.findViewById(R.id.textView);
        }
        public TextView getTextView() {
            return textView;
        }
    }

    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "MyAdapter::onCreateViewHolder: ");
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_row_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        holder.getTextView().setText(mDataset[position]);
        Log.d(TAG, "Element " + mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}