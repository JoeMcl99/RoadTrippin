package com.example.jmclaughlin6572.roadtrippin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        if (intent != null){
            String previousActivity = intent.getStringExtra("previousPage");
            if (previousActivity.equals("From_Login")){
                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
            }

        }
    }

    public void goToRadioMap(View view) {
        Intent intent = new Intent(this, RadioMap.class);
        startActivity(intent);
    }
    public void goToSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void goToStationList(View view) {
        Intent intent = new Intent(this, StationList.class);
        startActivity(intent);
    }
}
