package com.sanraphindustries.sanraph.breakfree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Seven extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperSeven;
    Button previousSeven;
    Button nextSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        //wire the view to java_code
        viewFlipperSeven = findViewById(R.id.viewFlipper_seven);
        nextSeven = findViewById(R.id.next_seven);
        previousSeven = findViewById(R.id.previous_seven);

        //set listener on views
        nextSeven.setOnClickListener(this);
        previousSeven.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextSeven){
            viewFlipperSeven.showNext();
        } else if (view == previousSeven){
            viewFlipperSeven.showPrevious();
        }
    }
}
