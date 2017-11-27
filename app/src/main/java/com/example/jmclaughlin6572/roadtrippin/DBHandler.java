package com.example.jmclaughlin6572.roadtrippin;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jmclaughlin6572 on 11/22/2017.
 */

public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "RadioDB";

    //CITY Table Name
    private static final String TABLE_CITY = "city";
    //CITY Table names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_ADDRESS = "address";

    //STATION Table Name
    private static final String TABLE_STATION = "station";
    //STATION Table names
    private static final String STATION_ID = "id";
    private static final String STATION_NAME = "name";
    private static final String STATION_FREQUENCY = "frequency";
    private static final String STATION_FORMAT = "format";


    public DBHandler(Context context){
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CITY + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_ADDRESS + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CITY);

        onCreate(db);
    }

    // Get Single City
    public City getCity(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CITY, new String[] { KEY_ID,
                        KEY_NAME, KEY_ADDRESS }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        City city = new City(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));

        return city;
    }

    //Get List of Cities
    public List<City> getAllContacts() {
        List<City> cityList = new ArrayList<City>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_CITY;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                City city = new City();
                city.set_id(Integer.parseInt(cursor.getString(0)));
                city.set_name(cursor.getString(1));
                city.set_address(cursor.getString(2));
                // Adding contact to list
                cityList.add(city);
            } while (cursor.moveToNext());
        }

        // return contact list
        return cityList;


    }
    public Station getStation(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_STATION, new String[] { STATION_ID,
                        STATION_NAME, STATION_FREQUENCY, STATION_FORMAT }, STATION_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Station station = new Station(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));

        return station;
    }

    public List<Station> getAllStations() {
        List<Station> stationList = new ArrayList<Station>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_STATION;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Station station = new Station();
                station.set_id(Integer.parseInt(cursor.getString(0)));
                station.set_name(cursor.getString(1));
                station.set_frequency(cursor.getString(2));
                station.set_format(cursor.getString(3));
                // Adding contact to list
                stationList.add(station);
            } while (cursor.moveToNext());
        }

        // return contact list
        return stationList;


    }
}
