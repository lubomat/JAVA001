package com.example.basics.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {

        String str = "Info";
        str = str.repeat(3);
        System.out.println(str);

        String joinedText = String.join(" ", "Raz", "Dwa", "Trzy");
        //delimiter oddziela
        System.out.println(joinedText);

        String text = "Ola ".concat("ma") + " kota".concat(".");
        System.out.println(text);

        String text2 = "Kupa" + " Kupa2" + " Kupa3";
        System.out.println(text2);

        // czy tak mozna ?? nie wiem ale dziala

    }
}
