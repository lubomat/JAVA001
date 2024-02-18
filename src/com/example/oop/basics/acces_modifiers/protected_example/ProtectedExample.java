package com.example.oop.basics.acces_modifiers.protected_example;

import com.example.oop.basics.acces_modifiers.protected_example.package1.Laptop;
import com.example.oop.basics.acces_modifiers.protected_example.package2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // computer.name = "sdf" // błąd brak dostepu do innego pakietu
        computer.setName("Dell");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());


    }
}
