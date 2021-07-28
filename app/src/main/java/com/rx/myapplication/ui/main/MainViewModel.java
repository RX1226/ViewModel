package com.rx.myapplication.ui.main;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public int count;

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("TAG", "onCleared()");
    }
}