package com.izaanschool.datatypes;

public class Appointment {

    public static void main(String[] args) {

        String date="may 5th 23";
        String time="12pm";
        String location="Queens mall";
        System.out.println("date:May 5th 23\n"+"time:12pm\n"+"location:Queens mall\n");

        boolean completed=true;
        boolean rescheduled=false;

        System.out.println("The appointment was competed?:"+ completed);
        System.out.println("rescheduled?:" + rescheduled);
    }

}
