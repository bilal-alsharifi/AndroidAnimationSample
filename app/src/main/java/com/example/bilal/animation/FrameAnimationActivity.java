package com.example.bilal.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button1);


        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.monkey_animation);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.setOneShot(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                if (animationDrawable.isRunning()){
                    animationDrawable.stop();
                }
                animationDrawable.start();

            }
        });

    }
}
