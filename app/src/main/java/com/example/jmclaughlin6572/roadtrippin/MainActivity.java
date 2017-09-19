package com.example.jmclaughlin6572.roadtrippin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (intent != null){
            String previousActivity = intent.getStringExtra("previousActivity");

            if (previousActivity.equals("From_Login")){
                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
            }
        }
    }
}
