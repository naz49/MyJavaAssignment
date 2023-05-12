package com.izaanschool.helloworld;

public class Survey {
    public static void main(String[] args) {
        System.out.println("question: "+"How satisfied are you with our services?");

    Responses();
    Results();
    }
    public static void Responses() {System.out.println("Responses:\n"
            +"Very satisfied\n"+
            "Satisfied\n"+
            "Neutral\n");

    }
    public static void Results() {
        System.out.println("Responses:\n"
                + "Very satisfied 70%\n" +
                "Satisfied 20%\n" +
                "Neutral 10%\n");

    }

}
