package com.example.sneha_negi.revive;

import android.app.Fragment;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sneha_negi on 22-04-19.
 */

public class Login extends android.support.v4.app.Fragment
{

    EditText e1,e2;
    Button btn1;
    TextView t1,t2,t3;

    public Login()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
       View v=inflater.inflate(R.layout.login,container,false);

     /*   e1= (EditText) v.findViewById(R.id.editone);
        e2= (EditText) v.findViewById(R.id.edittwo);

        btn1= (Button) v.findViewById(R.id.button4);

        t1= (TextView) v.findViewById(R.id.textView6);
        t2= (TextView) v.findViewById(R.id.textView11);
        t3= (TextView) v.findViewById(R.id.textView12);*/



        return v;
    }
}
