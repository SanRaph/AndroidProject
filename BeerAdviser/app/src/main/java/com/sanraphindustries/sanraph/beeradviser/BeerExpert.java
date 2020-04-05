package com.sanraphindustries.sanraph.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

  List<String>  getBrands(String color){
      List<String> brands = new ArrayList<>();
      if(color.equals ("Amber")){
          brands.add("Jack Amber");
          brands.add("Red moose Amber");
          brands.add("Jack Amber");
          brands.add("Red moose Amber");
          brands.add("Jack Amber");
          brands.add("Red moose Amber");
          brands.add("Jack Amber");
          brands.add("Red moose Amber");
          brands.add("Jack Amber");
          brands.add("Red moose Amber");



      }else if(color.equals("Light")){
          brands.add("San Mig Light");
          brands.add("Root Beer");
          brands.add("San Mig Light");
          brands.add("Root Beer");
          brands.add("San Mig Light");
          brands.add("Root Beer");
          brands.add("San Mig Light");
          brands.add("Root Beer");
          brands.add("San Mig Light");
          brands.add("Root Beer");


      } else {
          brands.add("Jaile Pale Ale");
          brands.add("Gout Stout");
          brands.add("Jaile Pale Ale");
          brands.add("Gout Stout");
          brands.add("Jaile Pale Ale");
          brands.add("Gout Stout");
          brands.add("Jaile Pale Ale");
          brands.add("Gout Stout");
          brands.add("Jaile Pale Ale");
          brands.add("Gout Stout");
          brands.add("Jaile Pale Ale");
      }
      return brands;


    }

}
