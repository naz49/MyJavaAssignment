package com.izaanschool.datatypes;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        String number = sc.nextLine();

        System.out.println("Enter expiration date:");
        String expirationDate = sc.nextLine();

        System.out.println("Enter Card holder Name:");
        String cardHolderName = sc.nextLine();


        // Output input by user
        System.out.println("Code: " + number);
        System.out.println("Discount Amount: " + expirationDate);
        System.out.println("Expiration Date: " + cardHolderName);
    }
}

