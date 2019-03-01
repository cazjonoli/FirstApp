package com.tidittii.firstandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button randNumGenButton = findViewById(R.id.randNumActivityButton);

        randNumGenButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), RandNumGenActivity.class);
                startActivity(startNewActivity);
            }
        });

        final Button singleNoteButton = findViewById(R.id.singleNoteButton);

        singleNoteButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), SingleNoteActivity.class);
                startActivity(startNewActivity);
            }
        });

        final Button reminderAppButton = findViewById(R.id.reminderAppButton);

        reminderAppButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), ReminderAppActivity.class);
                startActivity(startNewActivity);
            }
        });
    }
}
