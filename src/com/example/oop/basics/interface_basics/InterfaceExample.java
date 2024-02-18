package com.example.oop.basics.interface_basics;

import java.io.Flushable;

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        // Vehicle vehicle = new Vehicle();  // to nie jest klasa, interfejs nie ma konstruktora,
                                           // nie mozna stworzyc instancji na bazie interfejsu

        Vehicle vehicle = car;
        System.out.println(vehicle.getTopSpeed());
        vehicle.move();

        Vehicle car2 = new Car();
        car2.turn();
        Car someCar = (Car)car2;   // rzutowanie pozwala na pelny dostep do tej drugiej instancji na bazie klasy car
        System.out.println(someCar.getTopSpeed());

        Plane plane = new Plane();
        Vehicle planeVehicle = plane;
        System.out.println(planeVehicle.getTopSpeed());

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = car2;
        vehicles[2] = plane;    // przypisanie typów klas pod tablice typu interfejsów

        vehicles[2].move();

        if(vehicles[2] instanceof Plane) {
            Plane somePlane = (Plane)vehicles[2];  // zmiana typu na klase Plane za pomocą rzutowania
            somePlane.turn();

            Flying flyingVehicle = somePlane;
            flyingVehicle.increaseHeight();
        }
    }
}
