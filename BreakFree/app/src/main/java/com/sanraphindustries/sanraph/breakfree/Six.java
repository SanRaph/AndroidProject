package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Six extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperSix;
    Button previousSix;
    Button nextSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        //wire the view to java_code
        viewFlipperSix = findViewById(R.id.viewFlipper_six);
        nextSix= findViewById(R.id.next_six);
        previousSix = findViewById(R.id.previous_six);

        //set listener on views
        nextSix.setOnClickListener(this);
        previousSix.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextSix){
            viewFlipperSix.showNext();
        } else if (view == previousSix){
            viewFlipperSix.showPrevious();
        }
    }
}
