package com.example.programmer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by programmer on 22/5/15.
 */
public class Loading  extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_loading);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Loading.this, SignIn.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);


    }


    }
