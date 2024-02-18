package com.example.basics.data;

public class NumbersConversion {
    public static void main(String args[]) {

        //konwersja jawna - zaweżająca
        int i = 5;
        double d = 20.0d / (double) i;
        System.out.println(d);

        //konwersja niejawna - rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        // rzutowanie / casting
        double d2 = 5.5;
        int num = 10 * (int)d2; // przy konwersji float duble na
                                // typ całkowity czesc ulamkowa jest tracona
        System.out.println(num); // 50

        byte small = (byte)200; // rzutowanie z short na byte co powoduje utrate informacji
        System.out.println("small: " + small);




    }
}
