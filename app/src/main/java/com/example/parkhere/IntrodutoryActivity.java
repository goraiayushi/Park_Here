package com.example.parkhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntrodutoryActivity extends AppCompatActivity {

    private static  int SPLASH_SCREEN=1500;
    //variables
    ImageView logo, appname, car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdutory);

        logo=findViewById(R.id.logo);
        appname=findViewById(R.id.appname);
        car=findViewById(R.id.car);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(IntrodutoryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}