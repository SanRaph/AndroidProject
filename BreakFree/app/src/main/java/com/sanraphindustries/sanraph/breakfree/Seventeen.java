package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Seventeen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperSeventeen;
    Button previousSeventeen;
    Button nextSeventeen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen);

        //wire the view to java_code
        viewFlipperSeventeen = findViewById(R.id.viewFlipper_seventeen);
        nextSeventeen = findViewById(R.id.next_seventeen);
        previousSeventeen = findViewById(R.id.previous_seventeen);

        //set listener on views
        nextSeventeen.setOnClickListener(this);
        previousSeventeen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextSeventeen){
            viewFlipperSeventeen.showNext();
        } else if (view == previousSeventeen){
            viewFlipperSeventeen.showPrevious();
        }
    }
}
