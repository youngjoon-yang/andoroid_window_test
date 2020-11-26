package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SecondActivity extends Activity {

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
            intent.setClassName(this, ".SecondActivity");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return false;
        });

    }
}
