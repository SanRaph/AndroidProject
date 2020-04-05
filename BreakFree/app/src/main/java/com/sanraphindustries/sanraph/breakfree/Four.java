package com.sanraphindustries.sanraph.breakfree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Four extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperFour;
    Button previousFour;
    Button nextFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        //wire the view to java_code
        viewFlipperFour = findViewById(R.id.viewFlipper_four);
        nextFour = findViewById(R.id.next_four);
        previousFour = findViewById(R.id.previous_four);

        //set listener on views
        nextFour.setOnClickListener(this);
        previousFour.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == nextFour){
            viewFlipperFour.showNext();
        } else if (view == previousFour){
            viewFlipperFour.showPrevious();
        }
    }
}
