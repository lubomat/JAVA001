package com.example.oop.basics.inheritance.example1;

public class SuperCar extends Car {
    SuperCar() {
        type = "SuperCar";
        topSpeed = 300.0f;

    }

    public void setSportMode() {     // ta metoda bedzie dostepna tylko dla SuperCar
        System.out.println("Sport mode activated");
    }
}
