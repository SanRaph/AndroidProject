package com.sanraphindustries.sanraph.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity implements View.OnClickListener{
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    @Override
    public void onClick(View view) {
        //get a reference to the TextView
        TextView brands = findViewById(R.id.text_view);
        //get a reference to the Spinner
        Spinner beerColor = findViewById(R.id.spinner);
        //get the selected item in the Spinner and convert it to string first
        String beerColorToString = String.valueOf(beerColor.getSelectedItem());
        //get recommendation from the BeerExpert class
        List<String> listBrands = expert.getBrands(beerColorToString);
        //Formatting the text neatly using StringBuilder class
        StringBuilder brandsFormatted = new StringBuilder();
        //For every brand in the listBrands
        for (String brand : listBrands){
            //Add next line
            brandsFormatted.append(brand).append('\n');
        }

        //Display the beer list
        brands.setText(brandsFormatted);


    }
}
