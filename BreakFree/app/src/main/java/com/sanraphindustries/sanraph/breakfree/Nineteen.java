package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Nineteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperNineteen;
    Button previousNineteen;
    Button nextNineteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteen);

        //wire the view to java_code
        viewFlipperNineteen = findViewById(R.id.viewFlipper_nineteen);
        nextNineteen = findViewById(R.id.next_nineteen);
        previousNineteen = findViewById(R.id.previous_nineteen);

        //set listener on views
        nextNineteen.setOnClickListener(this);
        previousNineteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextNineteen){
            viewFlipperNineteen.showNext();
        } else if (view == previousNineteen){
            viewFlipperNineteen.showPrevious();
        }
    }
}
