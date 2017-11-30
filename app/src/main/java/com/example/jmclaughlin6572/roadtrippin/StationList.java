package com.example.jmclaughlin6572.roadtrippin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StationList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_list);

        ListView stationListView = (ListView) findViewById(R.id.stationList);

        ArrayList<Station> stationList = getStationNames();
        List< String> nameList = new ArrayList<String>();

        for (Station station: stationList){
            nameList.add(station.get_name());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, nameList);

        stationListView.setAdapter(adapter);

    }

    private ArrayList<Station> getStationNames(){




        ArrayList<Station> stationList = new ArrayList<Station>();

        DBHandler db = new DBHandler(this);

        Station testStation = new Station(1, "YYZ", "99.9", "Rock");

        db.addStation(testStation);

        stationList.addAll(db.getAllStations());

        return  stationList;
    }
}
