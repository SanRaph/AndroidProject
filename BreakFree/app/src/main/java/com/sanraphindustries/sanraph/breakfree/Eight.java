package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Eight extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperEight;
    Button previousEight;
    Button nextEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);


        //wire the view to java_code
        viewFlipperEight = findViewById(R.id.viewFlipper_eight);
        nextEight = findViewById(R.id.next_seven);
        previousEight = findViewById(R.id.previous_eight);

        //set listener on views
        nextEight.setOnClickListener(this);
        previousEight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextEight){
            viewFlipperEight.showNext();
        } else if (view == previousEight){
            viewFlipperEight.showPrevious();
        }
    }
}
