package com.sanraphindustries.sanraph.downloadurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            HttpUrlConnection =

    private String BASE_URL = "";
    private String MAX_RESULT =
            private Strring PRINT_TYPE =



    URI buitURI = URI.parse(BASE_URL)
            .buildUpon()
            .appendQuerryParameter()
    String uri = buitURI.toString();




    private String downLoadRUL (String uri) throws IOException {


        try {
            HttpURLConnection uriConnection = (HttpURLConnection) URI.create(uri);
            uriConnection.setReadTimeout(10000);
            uriConnection.setConnectTimeout(15000);
            uriConnection.connect();

            URL requestUri = new URL (builtURI.toString)
        }


    }
}
