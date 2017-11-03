package com.arm07.android.interactivestory.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.arm07.android.interactivestory.R;
import com.arm07.android.interactivestory.model.Page;
import com.arm07.android.interactivestory.model.Story;

public class StoryActivity extends AppCompatActivity {
    private Story story;
    private ImageView imageView;
    private TextView textView;
    private Button choice1Button,choice2Button;
    String name;
    public static final String TAG=StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent=getIntent();

        imageView=(ImageView)findViewById(R.id.storyImageView);
        textView=(TextView)findViewById(R.id.storyTextView);
        choice1Button=(Button)findViewById(R.id.choice1Button);
        choice2Button=(Button)findViewById(R.id.choice2Button);

        name=intent.getStringExtra("name");
        if (name==null || name.isEmpty())
            name="friend";
        Log.d(TAG,name);

        story=new Story();
        loadPage(0);
    }

    private  void loadPage(int pageNumber){
        Page page=story.getPage(pageNumber);
        Drawable image= ContextCompat.getDrawable(this,page.getImageId());
        imageView.setImageDrawable(image);

        String pageText=getString(page.getTxtId());
        pageText=String.format(pageText,name);
        textView.setText(pageText);

        choice1Button.setText(page.getChoice1().getTxtId());
        choice2Button.setText(page.getChoice2().getTxtId());

    }
}
