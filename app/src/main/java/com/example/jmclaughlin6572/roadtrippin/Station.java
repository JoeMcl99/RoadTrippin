package com.example.jmclaughlin6572.roadtrippin;

/**
 * Created by jmclaughlin6572 on 11/22/2017.
 */

public class Station {
    private int _id;
    private String _name;
    private String _frequency;
    private String _format;

    //Empty Constructor
    public  Station(){}

    public Station(int id, String name, String frequency, String format){
        this._id = id;
        this._name = name;
        this._frequency = frequency;
        this._format = format;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_frequency() {
        return _frequency;
    }

    public void set_frequency(String _frequency) {
        this._frequency = _frequency;
    }

    public String get_format() {
        return _format;
    }

    public void set_format(String _format) {
        this._format = _format;
    }
}
