package com.example.oop.basics.acces_modifiers.private_example;

public class Product {
    private String name;

    public Product() {
        this.name = "Unknown";
    }
    public Product(String name) { this.name = name; }

    public void setName(String name) {
        this.name = name + " !";
    }

    public String getName() {
        return name;
    }
}

