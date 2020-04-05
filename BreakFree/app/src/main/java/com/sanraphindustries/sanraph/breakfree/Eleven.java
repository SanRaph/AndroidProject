package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Eleven extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperEleven;
    Button previousEleven;
    Button nextEleven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);

        //wire the view to java_code
        viewFlipperEleven = findViewById(R.id.viewFlipper_ten);
        nextEleven = findViewById(R.id.next_ten);
        previousEleven = findViewById(R.id.previous_ten);

        //set listener on views
        nextEleven.setOnClickListener(this);
        previousEleven.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextEleven){
            viewFlipperEleven.showNext();
        } else if (view == previousEleven){
            viewFlipperEleven.showPrevious();
        }
    }
}
