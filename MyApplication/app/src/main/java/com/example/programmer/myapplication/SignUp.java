package com.example.programmer.myapplication;

/**
 * Created by programmer on 12/5/15.
 */

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SignUp extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_sign_up);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.button6);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SignUp.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });
    }


}
