package com.arm07.android.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.arm07.android.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.nameEditText);
        startButton=(Button)findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                startStory(name);
                //Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void startStory(String name) {
        Intent intent=new Intent(this,StoryActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);

    }
}
