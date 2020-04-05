package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class TwentyOne extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperTwentyOne;
    Button previousTwentyOne;
    Button nextTwentyOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_one);

        //wire the view to java_code
        viewFlipperTwentyOne = findViewById(R.id.viewFlipper_twenty_one);
        nextTwentyOne = findViewById(R.id.next_twenty_one);
        previousTwentyOne = findViewById(R.id.previous_twenty_one);

        //set listener on views
        nextTwentyOne.setOnClickListener(this);
        previousTwentyOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextTwentyOne){
            viewFlipperTwentyOne.showNext();
        } else if (view == previousTwentyOne){
            viewFlipperTwentyOne.showPrevious();
        }
    }
}
