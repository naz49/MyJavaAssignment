package com.izaanschool.datatypes;

import java.util.Scanner;

public class Event {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter date:");
        String date = sc.nextLine();

        System.out.println("Enter location:");
        String location = sc.nextLine();


        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("location: " + location);
    }

}
