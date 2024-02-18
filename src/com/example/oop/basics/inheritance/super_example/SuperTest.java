package com.example.oop.basics.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {

        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam", "Dobrzyński", "math");
        System.out.println(teacher.getTeachingSubject());
        Director director = new Director("Anna", "Zabłocka", 1);



    }
}
