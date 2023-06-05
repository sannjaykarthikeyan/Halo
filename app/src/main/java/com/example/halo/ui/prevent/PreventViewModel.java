package com.example.halo.ui.prevent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PreventViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PreventViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prevent fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}