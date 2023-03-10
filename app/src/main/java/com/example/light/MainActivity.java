package com.example.light;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mLinearLayout;
    private static final String KEY_COLOR = "COLOR";
    private Integer color = R.color.white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.button);
        if(savedInstanceState != null && savedInstanceState.containsKey(KEY_COLOR)) {
            color = savedInstanceState.getInt(KEY_COLOR);
            mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COLOR, color);
    }

    public void onClickBtnAddcolor1(View view){
        color = R.color.red_color;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    public void onClickBtnAddcolor2(View view){
        color = R.color.blue_color;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    public void onClickBtnAddcolor3(View view){
        color = R.color.purple_color;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }
}