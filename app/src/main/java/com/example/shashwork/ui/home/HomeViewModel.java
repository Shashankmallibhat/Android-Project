package com.example.shashwork.ui.home;

import android.widget.Spinner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");

    }

    public LiveData<String> getText() {
        return mText;
    }
}