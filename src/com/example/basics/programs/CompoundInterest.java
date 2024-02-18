package com.example.basics.programs;

import java.util.Scanner;

// procent składany
// 1000 * (1 + 0.05)^3
public class CompoundInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital; // rezultat oszczedzania

        System.out.println("Wpisz kapitał początkowy:");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie np 5 to 5%:");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczedzania:");
        numYears = in.nextInt();
        // numYears = Integer.valueOf(in.nextLine()).intValue();

        finalCapital = startCapital * Math.pow(1+ (yearlyInterest / 100.0d), numYears);

        System.out.println("Efekt oszczedzania z procentem skladanym: " + Math.round(finalCapital) );


    }
}
