package com.example.roora1598.lingoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=3000;
    ImageView iconMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        iconMain=(ImageView)findViewById(R.id.icon);
        iconMain.setImageResource(R.drawable.icon);
        iconMain.setTranslationY(-1500);
        iconMain.animate().translationYBy(1500).rotation(720).setDuration(600);
        iconMain.setTranslationX(-1500);
        iconMain.animate().translationXBy(1500).rotation(720).setDuration(600);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent homeIntent=new Intent( SplashActivity.this , MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
