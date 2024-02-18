package com.example.oop.basics;

import java.awt.*;

class PointWithConstants {
    int x, y;
    final int width = 12;
    final int height;                       // nie lepiej dac odrazu tu ?

    PointWithConstants() {
        height = 20;
    }  // TODO: 25.01.2023 na chuj tak?

    PointWithConstants(int posX, int posY) {
        this();
        x = posX;
        y = posY;

    }

    public void changePosition(final int newX, final int newY) {
        // newX = 30; // zmiana wartosci argumetu powoduje blad
        x = newX;  // TODO: 24.01.2023 95 7:30 
        y = newY;
    }
}

public class FinalConstatnsExample {
    public static void main(String[] args) {
        PointWithConstants point = new PointWithConstants(33,44);
        point.changePosition(55,66);
        System.out.println(" x " + point.x + " y " + point.y);
    }
}
