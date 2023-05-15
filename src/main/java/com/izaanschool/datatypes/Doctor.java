package com.izaanschool.datatypes;

import java.util.Scanner;

public class Doctor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Specialization:");
        String specialization= sc.nextLine();

        System.out.println("Enter Contact Info:");
        String contactInfo = sc.nextLine();


        // Output input by user
        System.out.println("Doctor's name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact info: " + contactInfo);
    }

}
