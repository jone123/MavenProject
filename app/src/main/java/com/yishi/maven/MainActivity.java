package com.yishi.maven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yishi.mylibrary.SDKManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void init(View view) {
        SDKManager.getInstance().init(MainActivity.this);
    }

    public void login(View view) {

    }
}