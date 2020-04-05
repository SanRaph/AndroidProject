package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Twenty extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperTwenty;
    Button previousTwenty;
    Button nextTwenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty);

        //wire the view to java_code
        viewFlipperTwenty = findViewById(R.id.viewFlipper_twenty);
        nextTwenty = findViewById(R.id.next_twenty);
        previousTwenty = findViewById(R.id.previous_twenty);

        //set listener on views
        nextTwenty.setOnClickListener(this);
        previousTwenty.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextTwenty){
            viewFlipperTwenty.showNext();
        } else if (view == previousTwenty){
            viewFlipperTwenty.showPrevious();
        }
    }
}
