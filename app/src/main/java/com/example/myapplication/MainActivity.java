package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager windowManager = getWindowManager();
        View view = getLayoutInflater().inflate(R.layout.activity_sub, null);
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(99);
        params.setTitle("blue window");
        windowManager.addView(view, params);
        TextView tv1 = view.findViewById(R.id.tv1);
        tv1.setOnTouchListener((v, event) ->
        {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.example.myapplication", "com.example.myapplication.MainActivity"));
//            intent.setAction("android.intent.action.HAHA");
//            intent.addCategory("android.intent.category.HOHO");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return false;
        });

    }
}