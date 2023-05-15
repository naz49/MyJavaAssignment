package com.izaanschool.datatypes;

import java.util.Scanner;

public class Contact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name,Email,phone number:");
        // String input
        String name = sc.nextLine();
        String email = sc.nextLine();
        String phoneNumber = sc.nextLine();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
    }


}


