package com.izaanschool.ifelse;

public class Address {

    public static void main(String[] args) {

        // Print Address
        System.out.println("Hello From Address Class!");
        System.out.println("Name:Nazrul");
        System.out.println("Zip:11111");
        System.out.println("City:New york");

        // Declaring variables and initializing it with a value
        String city ="NY";
        boolean hasStreetName = true;

        // Declare if Condition: using String
        if(city == "NY"){
            // Code to execute if condition is true
            System.out.println("NY is the city Name.");
        }

      // Declare if Condition: Using equals
       if(city == "CA"){
           // Code to execute if condition is true
           System.out.println("CA is the city Name.");
       }

       // Declare if Condition: Using  Boolean
        if(hasStreetName == true){
            // Code to execute if condition is true
           System.out.println("The Address Has Street Name.");
       }
        if(hasStreetName == false){
            // Code to execute if condition is true
            System.out.println("The Address Has NO Street Name.");
        }
    }
}
