package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class One extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperOne;
    Button previousOne;
    Button nextOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        //wire the view to java_code
        viewFlipperOne= findViewById(R.id.viewFlipper_one);
        nextOne = findViewById(R.id.next_one);
        previousOne = findViewById(R.id.previous_one);

        //set listener on views
        nextOne.setOnClickListener(this);
        previousOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == nextOne){
            viewFlipperOne.showNext();
        } else if (view == previousOne){
            viewFlipperOne.showPrevious();
        }
    }
}
