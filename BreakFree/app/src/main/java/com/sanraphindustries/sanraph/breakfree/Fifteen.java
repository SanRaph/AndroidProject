package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Fifteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperFifteen;
    Button previousFifteen;
    Button nextFifteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);

        //wire the view to java_code
        viewFlipperFifteen = findViewById(R.id.viewFlipper_fifteen);
        nextFifteen = findViewById(R.id.next_fifteen);
        previousFifteen = findViewById(R.id.previous_fifteen);

        //set listener on views
        nextFifteen.setOnClickListener(this);
        previousFifteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextFifteen){
            viewFlipperFifteen.showNext();
        } else if (view == previousFifteen){
            viewFlipperFifteen.showPrevious();
        }
    }
}
