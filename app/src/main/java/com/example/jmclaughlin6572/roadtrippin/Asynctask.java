package com.example.jmclaughlin6572.roadtrippin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by jmclaughlin6572 on 1/4/2018.
 */

    public class Asynctask extends AsyncTask<byte[], Void, Void> {
    @Override
    protected Void doInBackground(byte[]... bytes) {

        try {
            String path = "https://i.redd.it/qeapboyvy5201.jpg";
            java.net.URL url = new java.net.URL(path);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
//            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;

//
// InputStream in = null;
//        String path = "https://i.redd.it/qeapboyvy5201.jpg";
//        Bitmap bmp=null;
//        ImageView iv = (ImageView)findViewById(R.id.downloadedImage);
//        int responseCode = -1;
//        try{
//
//            URL url = new URL(path);
//            HttpURLConnection con = (HttpURLConnection)url.openConnection();
//            con.setDoInput(true);
//            con.connect();
//            responseCode = con.getResponseCode();
//            if(responseCode == HttpURLConnection.HTTP_OK)
//            {
//                //download
//                in = con.getInputStream();
//                bmp = BitmapFactory.decodeStream(in);
//                in.close();
//                iv.setImageBitmap(bmp);
//            }
//
//        }
//        catch(Exception ex){
//            Log.e("Exception",ex.toString());
//        }
    }
}
