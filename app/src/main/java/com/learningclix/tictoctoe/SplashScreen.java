package com.learningclix.tictoctoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent iMain = new Intent(SplashScreen.this, MainActivity.class);

        TextView splashScreen = findViewById(R.id.splashScreen);

        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        splashScreen.startAnimation(scale);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(iMain);
            }
        },8000L);
    }
}