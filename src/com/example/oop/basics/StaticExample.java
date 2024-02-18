package com.example.oop.basics;

class PlaneWithStatic {
    static int nextId = 0;   // wszystkie obiekty odwołają sie do to jednej zmiennej 0

    int id;
    int x, y;

    static int getNextId() {
        return nextId++;
    }

    PlaneWithStatic() {                // w ten sposob wartosc w kazdym jest zwiekszana o 1
        id = PlaneWithStatic.nextId;   // bez tego wszystkie bedą mialy 0
        nextId++;
    }

}
//StaticExample.main(args)  w ten spsob wirtualna maszyna javy wywoluje statyczna metode main
public class StaticExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {             // nie jest statyczne...
    return a - b;
    }

    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();


        System.out.println("Plane1.id: " + plane1.id);
        System.out.println("plane1.id: " + plane2.id);
        System.out.println("plane1.id: " + plane3.id);

        System.out.println(StaticExample.add(10,12) );

        StaticExample sExample = new StaticExample();    // ...dlatego trzeba stwozyc nowy obiekt
        System.out.println(sExample.substract(10,4));   // TODO: 25.01.2023 ? 
    }
}
