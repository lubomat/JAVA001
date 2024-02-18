package com.example.basics.data.string_class;

public class Function_indexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery";

        int index = str.indexOf("dwa trzy");
        System.out.println("dwa trzy, index: " + index);

        index = str.indexOf("pięć");// nie ma wiec - 1
        System.out.println("pięć, index: " + index);

        index = str.indexOf("trzy", 10);  // - 1 bo za 10 znakiem nie ma slowka trzy
        System.out.println("trzy, index: " + index);


    }
}
