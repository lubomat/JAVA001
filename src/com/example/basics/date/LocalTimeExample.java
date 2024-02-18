package com.example.basics.date;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuty: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond());

        localTime = localTime.plusHours(2);
        localTime = localTime.minusMinutes(10);
        localTime = localTime.plusSeconds(35);
        System.out.println("Czas po zmianie: ");
        System.out.println("Godzina: " + localTime.getHour());
        System.out.println("Minuty: " + localTime.getMinute());
        System.out.println("Sekundy: " + localTime.getSecond());

    }
}
