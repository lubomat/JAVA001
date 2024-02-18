package com.example.oop.basics.metods;

class Circle {
    float radius; // promień

    Circle(float r) {    // konstruktor
        radius = r;

    }
}



class MathMethods {             // zwracanie typu prostego return
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;

    }
    public Circle getNewCircle(float radius) { // metoda zwracana obiektu typ złożony
        Circle c = new Circle(radius);
        return c;
    }
}
public class ReturnValueAndObject {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int result = math.substract(a, b);
        System.out.println("result: " + result);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println("radius: " + circle.radius);
    }
}
