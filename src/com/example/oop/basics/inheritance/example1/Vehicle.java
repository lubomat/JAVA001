package com.example.oop.basics.inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle() {
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }

    public void printInfo() {
        System.out.println("type: " + type + " manufacturer: "
                + manufacturer + " top speed: " + topSpeed);

    }
}
