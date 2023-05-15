package com.izaanschool.datatypes;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter donor:");
        String donor = sc.nextLine();

        System.out.println("Enter amount:");
        String amount = sc.nextLine();

        System.out.println("Enter donation date:");
        String donationAmount = sc.nextLine();


        // Output input by user
        System.out.println("Donor name: " + donor);
        System.out.println("Amount: " + amount);
        System.out.println("Donation Amount: " + donationAmount);
    }


}
