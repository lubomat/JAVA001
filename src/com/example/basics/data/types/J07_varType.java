package com.example.basics.data.types;

public class J07_varType {
    public static void main(String args[]){
        int number = add(10, 5);
        System.out.println(number);
    }

    public static int add(int a, int b){
        int result = a + Integer.valueOf(b).intValue();
        return result;
    }
}
