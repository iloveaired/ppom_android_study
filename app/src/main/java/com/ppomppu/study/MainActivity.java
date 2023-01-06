package com.ppomppu.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.ppomppu.study.adapters.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "로그";
    protected RecyclerView mRecyclerView;
    protected MyAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    private static final int DATASET_COUNT = 60;
    protected String[] mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "MainActivity::onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        initDataset();


        // BEGIN_INCLUDE(initializeRecyclerView)
        mRecyclerView = findViewById(R.id.recyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
      //  mRecyclerView.scrollToPosition(scrollPosition);


        mAdapter = new MyAdapter(mDataset);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);


    }

    private void initDataset() {
        mDataset = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset[i] = "This is element #" + i;
        }
    }
}