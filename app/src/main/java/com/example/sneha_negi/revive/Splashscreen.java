package com.example.sneha_negi.revive;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {

    ImageView imageView;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1,b2,b3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank);

        imageView= (ImageView) findViewById(R.id.imageView);

       /* t1= (TextView) findViewById(R.id.textView2);
        t2= (TextView) findViewById(R.id.textView3);
        t3= (TextView) findViewById(R.id.textView4);
        t4= (TextView) findViewById(R.id.textView5);
        t5= (TextView) findViewById(R.id.textView7);
        t6= (TextView) findViewById(R.id.textView8);
        t7= (TextView) findViewById(R.id.textView9);
        t8= (TextView) findViewById(R.id.textView10);*/

        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

startActivity(new Intent(Splashscreen.this, com.example.sneha_negi.revive.Fragment.class));



            }
        });
    }
}
