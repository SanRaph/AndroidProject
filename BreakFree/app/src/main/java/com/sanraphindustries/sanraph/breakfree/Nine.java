package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Nine extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperNine;
    Button previousNine;
    Button nextNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        //wire the view to java_code
        viewFlipperNine = findViewById(R.id.viewFlipper_eight);
        nextNine = findViewById(R.id.next_seven);
        previousNine = findViewById(R.id.previous_eight);

        //set listener on views
        nextNine.setOnClickListener(this);
        previousNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextNine){
            viewFlipperNine.showNext();
        } else if (view == previousNine){
            viewFlipperNine.showPrevious();
        }
    }
}
