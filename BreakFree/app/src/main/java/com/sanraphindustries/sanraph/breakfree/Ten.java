package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Ten extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperTen;
    Button previousTen;
    Button nextTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);

        //wire the view to java_code
        viewFlipperTen = findViewById(R.id.viewFlipper_ten);
        nextTen = findViewById(R.id.next_ten);
        previousTen = findViewById(R.id.previous_ten);

        //set listener on views
        nextTen.setOnClickListener(this);
        previousTen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextTen){
            viewFlipperTen.showNext();
        } else if (view == previousTen){
            viewFlipperTen.showPrevious();
        }
    }
}
