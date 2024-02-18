package com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product {

    public Mouse mouse;
    public Keybord keybord;
    public Monitor monitor;


    Computer() {
        mouse = new Mouse();
        keybord = new Keybord();
        monitor = new Monitor();

        price = 1000.0f;

    }





}
