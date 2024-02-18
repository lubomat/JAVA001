package com.example.oop.basics.inheritance.abstract_classes;

public class Employee extends Person {
    @Override
    public void printInfo() {
        System.out.println("Employee: " + getName());
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }
}
