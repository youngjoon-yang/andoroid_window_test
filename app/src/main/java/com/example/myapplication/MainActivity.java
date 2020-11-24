package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager windowManager = getWindowManager();
        View view = getLayoutInflater().inflate(R.layout.activity_sub, null);
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(99);
        windowManager.addView(view, params);
    }
}