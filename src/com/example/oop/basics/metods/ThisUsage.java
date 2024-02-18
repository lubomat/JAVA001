package com.example.oop.basics.metods;

class Radio {
    int yearProduction;
    int volume;
    String station; // aktualna stacja radiowa

    Radio() {
        this.yearProduction = 2000;
        volume = 100;  // to samo co this.volume = 100;

    }

    Radio(int yearProduction) {
        this(); // wywołanie konstruktora bezargumentowego
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio production year: " + radio.yearProduction);

    }

    public void changeStation(String newStation) {
        this.station = newStation;


    }

}


public class ThisUsage {
    public static void main(String[] args) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(oldRadio.getRadio());

    }
}
