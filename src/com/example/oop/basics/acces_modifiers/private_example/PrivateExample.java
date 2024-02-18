package com.example.oop.basics.acces_modifiers.private_example;

public class PrivateExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName( "Ford");

        System.out.println( car.getName());

    }
}
