package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Fourteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperFourteen;
    Button previousFourteen;
    Button nextFourteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);

        //wire the view to java_code
        viewFlipperFourteen = findViewById(R.id.viewFlipper_fourteen);
        nextFourteen = findViewById(R.id.next_fourteen);
        previousFourteen = findViewById(R.id.previous_fourteen);

        //set listener on views
        nextFourteen.setOnClickListener(this);
        previousFourteen.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == nextFourteen){
            viewFlipperFourteen.showNext();
        } else if (view == previousFourteen){
            viewFlipperFourteen.showPrevious();
        }
    }
}
