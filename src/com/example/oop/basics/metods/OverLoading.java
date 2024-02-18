package com.example.oop.basics.metods;

class RectangleOverLoading {
    float side1, side2;


    RectangleOverLoading() {
        this(10.0f);            // w ten sposob wywolujemy drugi konstruktor

    }

    RectangleOverLoading(float v) { // pojedyncza wartosc
        side1 = side2 = v;
    }

    RectangleOverLoading(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;

    }
}

class MathOverLoading {
    public int add(int a, int b, int c) {      // te same metody
        return a + b + c;
    }
    public int add(int a, int b) {             // ale inne parametry
        return a + b;
    }
    public int add(float a, float b) {
        return (int) (a + b);              //(bez int) dlaczego lossy convertion ?
    }
    // TODO: 24.01.2023
    // 92/6:00
}


public class OverLoading {
    public static void main(String[] args) {
        MathOverLoading math = new MathOverLoading();

        int a = 12;
        int b = 3;
        System.out.println(math.add(a, b) );

        float f1 = 10.0f;
        float f2 = 12.0f;
        System.out.println( math.add(f1, f2) );

        int c = 5;
        System.out.println( math.add(a, b, c));

        RectangleOverLoading rect = new RectangleOverLoading();
        System.out.println("rect.side1: " + rect.side1 );

        RectangleOverLoading rect2 = new RectangleOverLoading(15.0f);
        System.out.println("rect2.side1: " + rect2.side1);

    }
}
