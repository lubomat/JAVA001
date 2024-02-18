package com.example.basics.data.string_class;

public class Functions_isEmpty {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = "  \n    ";

        if(emptyStr.isEmpty()) {  //false
            //true
            System.out.println("emptyStr jest pusty - isEmpty()");
        }else {
            System.out.println("blankStr nie jest pusty - isEmpty()");

        }
        if(emptyStr.isBlank()) {
            //true
            System.out.println("emptyStr ma 0 znakow lub same białe znaki - isBlank()");

        }

        if(blankStr.isBlank()) {
            //true
            System.out.println("blankStr ma 0 znakow lub same białe znaki - isBlank()");

        }
    }
}
