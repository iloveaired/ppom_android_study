package com.ppomppu.study;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    public   int counter = 0;


    private MutableLiveData<Integer> mutableCounter;

    public MutableLiveData<Integer> count() {
        return mutableCounter;
    }
    public String get(){
        return mutableCounter.getValue().toString();
    }
    public void inc() {
        mutableCounter.setValue(mutableCounter.getValue() + 1);
    }

    public void dec() {
        mutableCounter.setValue(mutableCounter.getValue() - 1);
    }

}
