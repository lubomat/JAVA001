package com.example.oop.basics.metods;

class Triangle {
    float a; // długość podstawy
    float h; // wysokość trójkąta
    float surfaceArea; // pole powierzchni

    Triangle(float base, float height) {
        a = base;
        h = height;

    }
}

class myMath {

    public void add(int a, int b) {
        a = 20;
        int result = a + b;
        System.out.println("Result: " + result);
    }
}

public class InvokingMetods {
    public static void main(String[] args) {
        myMath math = new myMath();
        int a = 10;
        int b = 7;
        math.add(a,b);
        System.out.println("a: " + a);

        Triangle triangle = new Triangle(10.0f, 5.0f);
        System.out.println(triangle);


    }
}
