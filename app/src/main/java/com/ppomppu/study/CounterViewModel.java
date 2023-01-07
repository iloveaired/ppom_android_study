package com.ppomppu.study;

import androidx.lifecycle.ViewModel;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private static final String TAG = "로그";

    private MutableLiveData<Integer> counter = new MutableLiveData<Integer>();

    public MutableLiveData<Integer> count() {
        return counter;
    }
    public String counter(){
        if(counter.getValue() == null){
            counter.setValue(new Integer(0));
        }
        return counter.getValue().toString();
    }
    public void inc() {
        if(counter.getValue() == null){
            counter.setValue(new Integer(0));
        }
        counter.setValue(counter.getValue() + 1);
    }

    public void dec() {
        counter.setValue(counter.getValue() - 1);
    }

}