package com.example.oop.basics;
                  // object orientet programing

class Car {                 //ta klasa jest dostepna tylko dla tego programu
    String manufacturer;    // szablon obiektów , zmienne
    String name;
    int year;
    String color;
    float topSpeed;

    public Car() {
        this.manufacturer = "unknown";
    }

    //musi byc public zeby mozna bylo z tego korzystac

    //2 opcja ?
    public Car(String manufacturer, String name,
               int year, String color,
               float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

        // void nic nie zwraca
    public void printInfo() {    //metoda  printInfo
        System.out.println(this.manufacturer + " "
                        + this.name + " "
                        + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();       // nowy obiekt na bazie klasy Car
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();   // Ford Mustang 1967 w konsoli

        Car chevrolet = new Car();  // kolejny egzemplarz
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "Green";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.00f;
        chevrolet.printInfo();   //Chevrolet Camaro 2020


        Car dodge = new Car("Dodge", "Viper"
                , 1997, "blue", 270.0f);
        dodge.printInfo();






    }
}
