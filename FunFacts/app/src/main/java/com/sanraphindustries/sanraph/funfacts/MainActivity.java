package com.sanraphindustries.sanraph.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare our View Variable
        final TextView factLabel = findViewById(R.id.factTextView);
        Button showFactButton = findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] facts = {
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",


                };
                //the button was clicked, so update the fact label with a new fact
                String fact;
                //Randomly select a fact
                Random randomGenerator = new Random(); //Construct a new Random number Generator
                int randomNumber = randomGenerator.nextInt(facts.length);

                fact = facts[randomNumber];



                //Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }


}

