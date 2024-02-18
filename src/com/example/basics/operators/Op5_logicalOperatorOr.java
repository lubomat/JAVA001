package com.example.basics.operators;

public class Op5_logicalOperatorOr {
    public static void main(String[] args) {

        //operator logiczny alternatywa, inaczej lub , or
        // true || true = true
        // true || false  = true

        System.out.println( 10 > 2 || 5 >= 1);

        boolean pierwszyWarunek = 10 > 2;
        boolean drugiWarunek = 5 >= 1;
        boolean wynik = pierwszyWarunek || drugiWarunek;
        System.out.println(wynik);
    }
}
