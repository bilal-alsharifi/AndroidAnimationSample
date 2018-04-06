package com.example.bilal.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button viewAnimationButton;
    private Button propertyAnimationButton;
    private Button activityAnimationButton;
    private Button frameAnimationButton;
    private Button transitionsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewAnimationButton = findViewById(R.id.view_animation_button);
        viewAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewAnimationActivity.class);
                startActivity(intent);
            }
        });


        propertyAnimationButton = findViewById(R.id.property_animation_button);
        propertyAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PropertyAnimationActivity.class);
                startActivity(intent);
            }
        });


        activityAnimationButton = findViewById(R.id.activity_animation_button);
        activityAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityAnimationActivity.class);
                startActivity(intent);

            }
        });


        frameAnimationButton = findViewById(R.id.frame_animation_button);
        frameAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
                startActivity(intent);
            }
        });


        transitionsButton = findViewById(R.id.transitions_button);
        transitionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransitionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
