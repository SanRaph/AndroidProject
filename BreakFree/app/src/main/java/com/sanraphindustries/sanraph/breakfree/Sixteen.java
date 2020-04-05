package com.sanraphindustries.sanraph.breakfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Sixteen extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipperSixteen;
    Button previousSixteen;
    Button nextSixteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);

        //wire the view to java_code
        viewFlipperSixteen = findViewById(R.id.viewFlipper_sixteen);
        nextSixteen = findViewById(R.id.next_sixteen);
        previousSixteen = findViewById(R.id.previous_sixteen);

        //set listener on views
        nextSixteen.setOnClickListener(this);
        previousSixteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == nextSixteen){
            viewFlipperSixteen.showNext();
        } else if (view == previousSixteen){
            viewFlipperSixteen.showPrevious();
        }
    }
}
