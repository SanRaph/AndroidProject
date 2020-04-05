package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Three extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperThree;
    Button previousThree;
    Button nextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        //wire the view to java_code
        viewFlipperThree = findViewById(R.id.viewFlipper_three);
        nextThree = findViewById(R.id.next_three);
        previousThree = findViewById(R.id.previous_three);

        //set listener on views
        nextThree.setOnClickListener(this);
        previousThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextThree){
            viewFlipperThree.showNext();
        } else if (view == previousThree){
            viewFlipperThree.showPrevious();
        }
    }
}
