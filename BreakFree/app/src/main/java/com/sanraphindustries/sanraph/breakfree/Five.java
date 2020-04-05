package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Five extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperFive;
    Button previousFive;
    Button nextFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        //wire the view to java_code
        viewFlipperFive = findViewById(R.id.viewFlipper_five);
        nextFive = findViewById(R.id.next_five);
        previousFive = findViewById(R.id.previous_five);

        //set listener on views
        nextFive.setOnClickListener(this);
        previousFive.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextFive){
            viewFlipperFive.showNext();
        } else if (view == previousFive){
            viewFlipperFive.showPrevious();
        }
    }
}
