package com.example.sneha_negi.revive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
        android.support.v4.app.Fragment loginFragment=new Login();
        ft.add(R.id.fragmentopener,loginFragment);


        ft.commit();
    }
}
