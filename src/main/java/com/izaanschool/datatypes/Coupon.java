package com.izaanschool.datatypes;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Code:");
        String code = sc.nextLine();

        System.out.println("Enter discount amount:");
        String discountAmount = sc.nextLine();

        System.out.println("Enter Expiration Date:");
        String expirationDate = sc.nextLine();


        // Output input by user
        System.out.println("Code: " + code);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
