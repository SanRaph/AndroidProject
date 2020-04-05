package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Intro extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperIntro;
    Button previousIntro;
    Button nextIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //wire the view to java_code
        viewFlipperIntro= findViewById(R.id.viewFlipper_intro);
        nextIntro = findViewById(R.id.next_intro);
        previousIntro = findViewById(R.id.previous_intro);

        //set listener on views
        nextIntro.setOnClickListener(this);
        previousIntro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == nextIntro){
            viewFlipperIntro.showNext();
        } else if (view == previousIntro){
            viewFlipperIntro.showPrevious();
        }

    }
}
