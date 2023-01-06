package com.ppomppu.study.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.ppomppu.study.databinding.ViewEmojiTextBinding;
import com.ppomppu.study.databinding.ViewHighlightTextBinding;

import com.ppomppu.study.databinding.ViewItemLoadingBinding;
import com.ppomppu.study.viewmodels.EmojiBaseViewHolder;
import com.ppomppu.study.viewmodels.HighlightBaseViewHolder;
import com.ppomppu.study.viewmodels.LoadingBaseViewHolder;
import com.ppomppu.study.viewmodels.BaseViewHolder;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final String TAG = "로그";

    private List<String> items;

    private final int VIEW_TYPE_LOADING = 1;

    public MyAdapter(List<String> it) {

        items = it;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "MyAdapter::onCreateViewHolder: ");


        if(viewType == VIEW_TYPE_LOADING){

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new LoadingBaseViewHolder(ViewItemLoadingBinding.inflate(inflater,parent,false ));

        }else if (viewType == 0){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new HighlightBaseViewHolder(ViewHighlightTextBinding.inflate(inflater,parent,false ));
        } else {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            return new EmojiBaseViewHolder(ViewEmojiTextBinding.inflate(inflater,parent,false ));
        }


    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
       //    holder.getTextView().setText(items[position]);
        Log.d(TAG, "Element " + items.get(position));
        holder.onBindViewHolder(items.get(position));

    }

    @Override
    public int getItemViewType(int position) {
        // Just as an example, return 0 or 2 depending on position
        // Note that unlike in ListView adapters, types don't have to be contiguous
        if(items.get(position) == null) return VIEW_TYPE_LOADING;
        return position % 2 * 2;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}