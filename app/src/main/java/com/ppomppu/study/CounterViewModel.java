package com.ppomppu.study;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

public class CounterViewModel extends ViewModel {

    public MutableLiveData<Integer> counter = new MutableLiveData<Integer>();
    public CounterViewModel(){
        counter.setValue(0);
    }
    public MutableLiveData<Integer> count() {
        return counter;
    }
    public String counter(){
        return counter.getValue().toString();
    }
    public void inc() {
        counter.setValue(counter.getValue() + 1);
    }

    public void dec() {
        counter.setValue(counter.getValue() - 1);
    }

}