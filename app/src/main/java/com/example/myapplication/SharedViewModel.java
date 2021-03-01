package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {


    private MutableLiveData <CharSequence> text = new MutableLiveData<>();

    public void  setText (CharSequence text){
        this.text.setValue(text);
    }
    public LiveData<CharSequence> getText (){
        return  text;
    }
}
