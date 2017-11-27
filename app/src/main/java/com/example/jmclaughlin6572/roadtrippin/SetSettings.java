package com.example.jmclaughlin6572.roadtrippin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SetSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_set_settings);
        List<String> genreArray =  new ArrayList<String>();
        genreArray.add("Rock");
        genreArray.add("Hip-hop");
        genreArray.add("Country");
        genreArray.add("Pop Music");
        genreArray.add("Classics");
        genreArray.add("Blues");
        genreArray.add("Opera");
        genreArray.add("EDM");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, genreArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        Spinner spinnerItems = (Spinner) findViewById(R.id.genreSpinner);
        spinnerItems.setAdapter(adapter);

    }

    public void saveSettings(View view) {

        Intent intent = new Intent(SetSettings.this, MainActivity.class);

        intent.putExtra("previousPage", "From_Login");
        startActivity(intent);
    }


}
