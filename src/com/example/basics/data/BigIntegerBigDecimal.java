package com.example.basics.data;

import java.math.*;

public class BigIntegerBigDecimal {
    public static void main(String args[]) {

        BigInteger bigInt = new BigInteger("345345345345345345345345345");
        bigInt = bigInt.add(new BigInteger("123123123123123123123123123123"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal("23213123123213.3123123123");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("123123213213123"));
        System.out.println("Wynik: " + decimal);

    }

}
