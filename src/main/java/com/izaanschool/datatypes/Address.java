package com.izaanschool.datatypes;

import org.omg.CORBA.NO_IMPLEMENT;

public class Address {

    // Declare Main Method
    public static void main(String[] args) {

        // Print Address
        String street="14461";
        String city="New york";
        String zipCode="11111";
        System.out.println("street:14461\n"+"Zip:11111\n"+"City:New york\n");

        boolean hasApartment=false;
        boolean hasStreetname=true;
        System.out.println("Has Apartment:" + hasApartment);
        System.out.println("Has Street Name:" + hasStreetname);

    }

}