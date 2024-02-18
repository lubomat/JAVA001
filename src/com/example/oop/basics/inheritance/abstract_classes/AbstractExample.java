package com.example.oop.basics.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", "Kowalski",32);
        worker1.printInfo();

        Manager manager = new Manager("Olek", "Zend", 20,"R&B");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

        // Person person1 = new Person(); - błąd

        // nie mozna tworzyc nowej klasy na bazie klasy abstrakcyjnej







    }
}
