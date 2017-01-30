package com.example.student2.untitle4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Character player;
    Story story;
    int current = 0;


    private void updateTitle(){
        ((TextView)findViewById(R.id.title)).setText(story.current_situation.subject);
    }
    private void updateDesc(){
        ((TextView)findViewById(R.id.desc)).setText(story.Situations[current].text);
    }
    private void updateLayout() {
        ((LinearLayout) findViewById(R.id.layout)).removeAllViews();
        //разместить кнопку для каждого варианта
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
