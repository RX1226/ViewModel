package com.rx.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.rx.myapplication.ui.main.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private MainViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate()");

        model = new ViewModelProvider(this).get(MainViewModel.class);

        findViewById(R.id.btn_go).setOnClickListener(
                view -> startActivity(new Intent(MainActivity.this, MainActivity2.class))
        );

        findViewById(R.id.btn_go_and_finish).setOnClickListener(
                view -> {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    finish();
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        ++model.count; //回來一次就+1
        Log.d("TAG", "count = " + model.count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy()");
    }
}