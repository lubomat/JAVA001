package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLenghtComaprator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();    // TODO: 13.02.2023
    }                                       //o1 o2 ?
}

public class PriorityQueueStringLenghtComparator {
    public static void main(String[] args) {

        PriorityQueue<String> test =           // kolejnosc wg ilosci znakow
                new PriorityQueue<>(new StringLenghtComaprator());
        test.add("Daniel");
        test.add("Ola");
        test.add("Zuzanna");
        test.add("Adam");
        test.add("Kasia");

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
