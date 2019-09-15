package com.lizimire;

public class PrimitiveDataTypes {

    public void explain() {
        byte bytex = 100;
        short shortex = 30000;
        int intex = 214567;
        long longex = 1234567890;
        char charex = 'A';
        boolean boolex = Boolean.TRUE;
        float floatex = 5.73f;
        double doubex = 20.64d;

        String bytefact = "Stores whole numbers from -128 to 127";
        String shortfact = "Stores whole numbers from -32,768 to 32,767";
        String intfact = "Stores whole numbers from -2,147,483,648 to 2,147,483,647";
        String longfact = "Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807";
        String charfact = "Stores a single character/letter";
        String boolfact = "Stores true or false values";
        String floatfact = "Stores 6 to 7 decimal digits";
        String doublefact = "Stores up to 15 decimal digits";

        System.out.println("Byte example:");
        System.out.println(bytex);
        System.out.println(bytefact + "\n");

        System.out.println("Short example:");
        System.out.println(shortex);
        System.out.println(shortfact + "\n");

        System.out.println("Int example:");
        System.out.println(intex);
        System.out.println(intfact + "\n");

        System.out.println("Long example:");
        System.out.println(longex);
        System.out.println(longfact + "\n");

        System.out.println("Char example:");
        System.out.println(charex);
        System.out.println(charfact + "\n");

        System.out.println("Boolean example:");
        System.out.println(boolex);
        System.out.println(boolfact + "\n");

        System.out.println("Float example:");
        System.out.println(floatex);
        System.out.println(floatfact + "\n");

        System.out.println("Double example:");
        System.out.println(doubex);
        System.out.println(doublefact + "\n");

    }
}
