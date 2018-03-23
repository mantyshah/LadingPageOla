package com.ladingpage.devsoftware.ladingpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView taxi;
    Animation animSlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taxi = (ImageView) findViewById(R.id.taxiImageView);
        animSlide = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);

        taxi.startAnimation(animSlide);
    }
}
