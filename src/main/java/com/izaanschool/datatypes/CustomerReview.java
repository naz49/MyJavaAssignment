package com.izaanschool.datatypes;

import java.util.Scanner;

public class CustomerReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product:");
        String product = sc.nextLine();

        System.out.println("Enter rating:");
        String rating = sc.nextLine();

        System.out.println("Enter Comment:");
        String comment = sc.nextLine();


        // Output input by user
        System.out.println("Code: " + product);
        System.out.println("Discount Amount: " + rating);
        System.out.println("Expiration Date: " + comment);
    }

}
