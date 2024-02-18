package com.example.oop.basics.exceptions;

import com.example.oop.basics.inheritance.final_example.Test;

class TestException extends Exception {
    public TestException() {
        super("TestException happened!");
    }

    public TestException(String message) {
        super(message);
    }
}

public class ThrowException {

    public int divide(int number, int divisor) throws ArithmeticException {
        return number / divisor;
    }

    public int test(int number) throws TestException {
        if(1==1) throw  new TestException();
        return 1;
    }

    public static void main(String[] args) {

        try{
            int numArr[] = {0,1,2,3,4,5};
            int a = numArr[2];
            int divisor = numArr[0];

            if (divisor == 0) throw new ArithmeticException("Dzielenie przez zero");
        } catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code.");
        }

        System.out.println("Program continues");

        ThrowException throwException = new ThrowException();
        try {
            throwException.divide(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwException.test(12);
        } catch(TestException exception) {
            exception.printStackTrace();
        }
    }
}

