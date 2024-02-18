package com.example.basics.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        System.out.println( Math.round(5.51) ); // 6
        System.out.println(Math.round((5.49))); // 5

        System.out.println( (int) 5.45d );

        //Math.ceil() - najwieksza mozliwa calkowita liczba
        System.out.println(Math.ceil(6.11));
        System.out.println(Math.ceil(6.8));

        System.out.println(Math.floor(6.11));
        System.out.println(Math.floor(6.8));



    }
}
