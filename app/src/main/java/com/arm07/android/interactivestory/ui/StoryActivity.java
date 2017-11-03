package com.arm07.android.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.arm07.android.interactivestory.R;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG=StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent=getIntent();
        
        String name=intent.getStringExtra("name");
        Log.d(TAG,name);
    }
}
