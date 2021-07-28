package com.rx.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        findViewById(R.id.btn_back).setOnClickListener(
                view -> finish()
        );

        findViewById(R.id.btn_intent_back).setOnClickListener(
                //這種會一直啟動新的activity, 疊上去
                view -> startActivity(new Intent(MainActivity2.this, MainActivity.class))
        );
    }
}