package com.example.oop.basics.inheritance.example2_shop;

import java.security.Key;

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Keybord keybord = new Keybord();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);

        System.out.println("monitor price: " + monitor.price);
        System.out.println("keybord price: " + keybord.price);
        System.out.println("computer price: " + computer.price);


    }
}
