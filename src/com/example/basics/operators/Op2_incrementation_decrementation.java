package com.example.basics.operators;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println("a++ " + a);

        int b = 5;
        int c = 10 +b++; // inkrementacja przyrostkowa
        System.out.println("c: " + c); // 15
        System.out.println("b: " + b); // 6

        int d = 5;
        int e = 10 + ++d; // inkrementacja przedrostkowa
        System.out.println("e: " + e);
        System.out.println("d: " +d);

    }
}
