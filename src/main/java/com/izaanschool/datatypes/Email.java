package com.izaanschool.datatypes;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sender:");
        String sender = sc.nextLine();

        System.out.println("Enter recipient:");
        String recipient = sc.nextLine();

        System.out.println("subject:");
        String subject = sc.nextLine();


        // Output input by user
        System.out.println("Sender: " + sender);
        System.out.println("recipient: " +recipient);
        System.out.println("subject: " + subject);
    }
}
