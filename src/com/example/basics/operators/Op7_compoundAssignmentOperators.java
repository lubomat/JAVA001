package com.example.basics.operators;

public class Op7_compoundAssignmentOperators {
    public static void main(String[] args) {
        // złożone operatory przypisania
        // += -+ *= /= %=

        int a = 5;
        a += 10;
        System.out.println(a); // 15

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 20;
        c %= 3;
        System.out.println(c);


    }
}
