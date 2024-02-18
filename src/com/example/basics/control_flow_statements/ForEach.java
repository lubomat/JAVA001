package com.example.basics.control_flow_statements;

public class ForEach {
    public static void main(String[] args) {

        String strArr[] = { "Ola", "Adam", "Kasia", "Olek" }; // tablica

        for(String str : strArr) {             //petla
            if(str.equalsIgnoreCase("Kasia")) continue;
            System.out.println(str);
        }

    }
}
