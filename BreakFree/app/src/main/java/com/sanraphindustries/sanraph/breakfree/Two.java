package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Two extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperTwo;
    Button previousTwo;
    Button nextTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //wire the view to java_code
        viewFlipperTwo= findViewById(R.id.viewFlipper_two);
        nextTwo = findViewById(R.id.next_two);
        previousTwo = findViewById(R.id.previous_two);

        //set listener on views
        nextTwo.setOnClickListener(this);
        previousTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == nextTwo){
            viewFlipperTwo.showNext();
        } else if (view == previousTwo){
            viewFlipperTwo.showPrevious();
        }
    }
}
