package com.example.oop.basics.inheritance.final_example;

class Employee {
    String name;
    String surname;
    String jobTitle;
    float salary;
}

class Menager extends Employee {
    String responsibility;
}

class Director extends Menager {
    String department;
}

class VicePresident extends Director {

}
final class CEO extends VicePresident {   // nie mozna juz rozszerzac tej klasy bo jest final
    String companyName;
}

public class Test {
    public static void main(String[] args) {

        CEO ceo = new CEO();

    }
}
