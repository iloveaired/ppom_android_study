package com.ppomppu.study;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.ppomppu.study.adapters.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "로그";
    protected RecyclerView recyclerView;
    protected MyAdapter adapter;

    private boolean isLoading = false;
    private static final int DATASET_COUNT = 5;

    protected List<String> items = new ArrayList<String>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "MainActivity::onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);


        recyclerView = findViewById(R.id.recyclerView);
        populateData();

        initAdapter();

        //https://www.digitaloceahttps://www.digitalocean.com/community/tutorials/android-recyclerview-load-more-endless-scrollingn.com/community/tutorials/android-recyclerview-load-more-endless-scrolling
        initScrollListener();

    }

    private void populateData() {

        for (int i = 0; i < 10; i++) {
            items.add("This is element #" + String.valueOf(i));
        }
    }



    private void initAdapter() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);

    }

    private void initScrollListener() {
        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

                if (!isLoading) {
                    if (layoutManager != null && layoutManager.findLastCompletelyVisibleItemPosition() == items.size() - 1) {
                        //리스트 마지막
                        loadMore();
                        isLoading = true;
                    }
                }
            }
        });
    }

    private void loadMore() {
        items.add(null);
        adapter.notifyItemInserted(items.size() - 1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                items.remove(items.size() - 1);
                int scrollPosition = items.size();
                adapter.notifyItemRemoved(scrollPosition);
                int currentSize = scrollPosition;
                int nextLimit = currentSize + 10;

                while (currentSize - 1 < nextLimit) {
                    items.add("Item " + currentSize);
                    currentSize++;
                }

                adapter.notifyDataSetChanged();
                isLoading = false;
            }
        }, 1000);
    }


}