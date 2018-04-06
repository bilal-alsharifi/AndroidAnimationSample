package com.example.bilal.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class PropertyAnimationActivity extends AppCompatActivity {

    ImageView imageView;
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);

        imageView = findViewById(R.id.imageView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ValueAnimator animator = ValueAnimator.ofFloat(20f, 400f);

                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        imageView.setX((Float) animation.getAnimatedValue());
                    }
                });

                animator.setDuration(2000);
                animator.setInterpolator(new AnticipateOvershootInterpolator());
                animator.setTarget(imageView);
                animator.setRepeatCount(1);
                animator.setRepeatMode(ValueAnimator.REVERSE);
                animator.start();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Object Animator extends ValueAnimator
                // It animates automatically
                // without the need of applying the animation in onAnimationUpdate()
                ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0f, 700f)
                        .setDuration(1000);
                animator.setInterpolator(new BounceInterpolator());
                animator.start();

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 2f)
                        .setDuration(1000);
                ObjectAnimator animator2 = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 2f)
                        .setDuration(1000);
                AnimatorSet set = new AnimatorSet();
                set.playSequentially(animator1, animator2);
                set.start();

            }
        });

    }
}
