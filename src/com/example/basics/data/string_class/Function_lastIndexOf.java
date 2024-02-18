package com.example.basics.data.string_class;

public class Function_lastIndexOf {
    public static void main(String[] args) {
        String str = "Raz dwa trzy cztery. Raz dwa.";

        int index = str.lastIndexOf("Raz");  // = 21
        System.out.println("Ostatnie wystąpienie 'Raz': " + index);
        String fragment = str.substring(index);
        System.out.println("Fragment: " + fragment);

        index = str.indexOf("Raz");  // = 0
        System.out.println("Pierwsze wystąpienie 'Raz': " + index);

        // jak nie znajdzie slowa to -1
    }
}
