package com.ppomppu.study;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    public   int counter = 0;
    private static final String TAG = "로그";

    private MutableLiveData<Integer> mutableCounter = new MutableLiveData<Integer>();

    public MutableLiveData<Integer> count() {
        return mutableCounter;
    }
    public String counter(){


        return mutableCounter.getValue().toString();
    }
    public void inc() {

        Log.d(TAG, "CounterViewModel::inc:1 ");
        Log.d(TAG, "CounterViewModel::inc: " + mutableCounter.toString());
        if(mutableCounter.getValue() == null){
            Log.d(TAG, "CounterViewModel::inc:2 ");
            mutableCounter.setValue(new Integer(0));
        }
        Log.d(TAG, "CounterViewModel::inc:3 ");
        mutableCounter.setValue(mutableCounter.getValue() + 1);
    }

    public void dec() {
        mutableCounter.setValue(mutableCounter.getValue() - 1);
    }

}
