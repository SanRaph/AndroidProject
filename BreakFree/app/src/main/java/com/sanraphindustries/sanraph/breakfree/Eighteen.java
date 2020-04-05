package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Eighteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperEighteen;
    Button previousEighteen;
    Button nextEighteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen);

        //wire the view to java_code
        viewFlipperEighteen = findViewById(R.id.viewFlipper_eighteen);
        nextEighteen = findViewById(R.id.next_eighteen);
        previousEighteen= findViewById(R.id.previous_eighteen);

        //set listener on views
        nextEighteen.setOnClickListener(this);
        previousEighteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextEighteen){
            viewFlipperEighteen.showNext();
        } else if (view == previousEighteen){
            viewFlipperEighteen.showPrevious();
        }

    }
}
