package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Twelve extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperTwelve;
    Button previousTwelve;
    Button nextTwelve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);

        //wire the view to java_code
        viewFlipperTwelve = findViewById(R.id.viewFlipper_twelve);
        nextTwelve = findViewById(R.id.next_twelve);
        previousTwelve = findViewById(R.id.previous_twelve);

        //set listener on views
        nextTwelve.setOnClickListener(this);
        previousTwelve.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextTwelve){
            viewFlipperTwelve.showNext();
        } else if (view == previousTwelve){
            viewFlipperTwelve.showPrevious();
        }
    }
}
