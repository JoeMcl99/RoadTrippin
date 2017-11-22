package com.example.jmclaughlin6572.roadtrippin;

/**
 * Created by jmclaughlin6572 on 11/22/2017.
 */

public class City {
    private int _id;
    private String _name;
    private String _address;

    //Empty Constructor
    public  City(){}


    //Constructor
    public City(int id, String name, String address){
        this._id = id;
        this._name = name;
        this._address = address;
    }
    //Getters and setters
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
