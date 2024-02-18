package com.example.collections;


import java.util.Comparator;
import java.util.TreeSet;

class AnimalElement {
    private String name;

    public AnimalElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalElement{" +
                "name='" + name + '\'' +
                '}';
    }
}

class AnimalElementCOmparator implements Comparator<AnimalElement> {
    @Override
    public int compare(AnimalElement o1, AnimalElement o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<AnimalElement> animals = new TreeSet<>(new AnimalElementCOmparator());
        animals.add(new AnimalElement("Tiger"));
        animals.add(new AnimalElement("Lion"));
        animals.add(new AnimalElement("Dog"));

        for (AnimalElement a: animals) {
            System.out.println(a);
        }

    }
}
