package com.example.basics.control_flow_statements;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 10;

        while (i > 0)  {
            System.out.println(i);
            // i--; bo petla bedzie nieskonczona o ile damy warunek zeby sie skonczyla
            i--;
        }

        i = 0;
        while (i < 6) {
            System.out.println("i:" + i);
            i++;
        }
    }
}
