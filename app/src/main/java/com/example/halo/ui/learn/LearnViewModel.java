package com.example.halo.ui.learn;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.halo.R;

public class LearnViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LearnViewModel() {
        mText = new MutableLiveData<>();
        // mText.setValue("Text");
    }

    public LiveData<String> getText() {
        return mText;
    }
}