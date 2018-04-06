package com.example.bilal.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class TransitionsActivity extends AppCompatActivity {

    Button button;
    int mCurrentScene = 1;
    Scene mScene1, mScene2;
    ViewGroup mSceneRoot;
    TransitionManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transitions);


        button = findViewById(R.id.button1);

        mSceneRoot = findViewById(R.id.scene_root);
        mScene1 = Scene.getSceneForLayout(mSceneRoot, R.layout.scene1, this);
        mScene2 = Scene.getSceneForLayout(mSceneRoot, R.layout.scene2, this);
        mManager = TransitionInflater.from(this)
                .inflateTransitionManager(R.transition.manager, mSceneRoot);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentScene == 1){
                    TransitionManager.go(mScene2);
                    mCurrentScene = 2;
                } else {
                    mManager.transitionTo(mScene1);
                    mCurrentScene = 1;
                }
            }
        });

    }
}
