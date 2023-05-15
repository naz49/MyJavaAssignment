package com.izaanschool.datatypes;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter designation:");
        String designation = sc.nextLine();

        System.out.println("Enter salary:");
        String salary = sc.nextLine();


        // Output input by user
        System.out.println("salary: " + salary);
        System.out.println("designation: " + designation);
        System.out.println("salary: " + salary);
    }
}
