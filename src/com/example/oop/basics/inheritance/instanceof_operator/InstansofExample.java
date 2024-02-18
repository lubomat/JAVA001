package com.example.oop.basics.inheritance.instanceof_operator;

import java.util.Date;

class Animal {
    protected String name;
    protected float weight;  //kg
    protected int numLegs;

}

class Dog extends Animal {
    protected void bark() {     // szczekanie
        System.out.println("Dog bark!");
    }
}

class Bird extends Animal {
    protected void fly() {
        System.out.println("flying bird!");
    }
}

class Parrot extends Bird {
    protected void learnWord() {
        System.out.println("learned word");
    }
}

public class InstansofExample {
    public static <bird> void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;      // true
        System.out.println(result);

        Animal animal = new Animal();
        System.out.println( dog instanceof Animal);  // true

        Bird bird = new Bird();
        System.out.println(bird instanceof Animal); // true
        System.out.println( bird instanceof Bird ); // true
        System.out.println( animal instanceof Bird );  // false

        Parrot parrot = new Parrot();
        System.out.println(parrot instanceof Parrot);  // true
        System.out.println(parrot instanceof Bird); // true
        System.out.println(animal instanceof Parrot); // false
        // System.out.println(dog instanceof Bird);  // błąd kompilacji

    }

}
