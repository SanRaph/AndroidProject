package com.sanraphindustries.sanraph.breakfree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Thirteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperThirteen;
    Button previousThirteen;
    Button nextThirteen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);

        //wire the view to java_code
        viewFlipperThirteen = findViewById(R.id.viewFlipper_thirteen);
        nextThirteen = findViewById(R.id.next_thirteen);
        previousThirteen = findViewById(R.id.previous_thirteen);

        //set listener on views
        nextThirteen.setOnClickListener(this);
        previousThirteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextThirteen){
            viewFlipperThirteen.showNext();
        } else if (view == previousThirteen){
            viewFlipperThirteen.showPrevious();
        }
    }
}
