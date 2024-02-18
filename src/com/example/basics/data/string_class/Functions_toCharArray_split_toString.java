package com.example.basics.data.string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String[] args) {

        String str = "Ola ma kota";

        char arr[] = str.toCharArray(); // tablica
        System.out.println("Liczba znaków: " + arr.length);

        String strArr[] = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String s = str.toString(); // bez sensu
        System.out.println(s);

        System.out.println(strArr.toString());

        Integer i = new Integer(123);
        System.out.println(i.toString());

        String text = "Liczba: " + i;
        System.out.println(text);


    }
}
