package com.example.oop.basics.acces_modifiers.no_modifier;

import com.example.oop.basics.acces_modifiers.no_modifier.package1.Laptop;
import com.example.oop.basics.acces_modifiers.no_modifier.package2.Computer;

public class NoModifierExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // computer.name = "sdf" // błąd brak dostepu do innego pakietu
        computer.setName("Dell");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());


    }
}
