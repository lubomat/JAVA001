package com.example.generics;

import java.util.ArrayList;

class Util {
    public static <T> T getLastElement(ArrayList<T> arr) {
        return arr.get(arr.size() - 1);
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(12);
        System.out.println(Util.getLastElement(arr));

    }
}
