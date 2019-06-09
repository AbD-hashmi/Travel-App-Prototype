package com.example.sneha_negi.revive;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        imageView= (ImageView) findViewById(R.id.imageView2);
        animation= AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        imageView.setAnimation(animation);



        //getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent=new Intent(MainActivity.this,Splashscreen.class);
                startActivity(intent);
                finish();

            }
        },6000);

    }
}
