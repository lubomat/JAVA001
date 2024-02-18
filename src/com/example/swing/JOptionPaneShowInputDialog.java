package com.example.swing;

import javax.swing.*;

public class JOptionPaneShowInputDialog {
    public static void main(String[] args) {

        /* String result = JOptionPane.showInputDialog(
                null,
                "Wpisz swoje imię:"
        );

        System.out.println("Imię: " + result);  */

        String cars[] = {"Ford","BMW","Dodge"};
        String result2 = (String) JOptionPane.showInputDialog(
                null,
                null,
                "Wybierz Samochód",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]
        );

        System.out.println("Wybrane auto: " + result2);


    }
}
