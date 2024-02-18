package com.example.basics.data.string_class;

public class StringsComparision {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if(s2.equals(s1)) System.out.println("s2 rowne jest s1");

        if(s2.equals(s3)) System.out.println("s2 rowne jest s3"); //false

        if(s2.equalsIgnoreCase(s3)) System.out.println("s2 rowne jest s3");
        //ignoruje wielkosc znakow wiec true


    }
}
