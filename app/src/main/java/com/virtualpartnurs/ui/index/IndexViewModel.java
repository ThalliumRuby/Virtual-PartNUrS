package com.virtualpartnurs.ui.index;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndexViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IndexViewModel() {
    }

    public LiveData<String> getText() {
        return mText;
    }
}