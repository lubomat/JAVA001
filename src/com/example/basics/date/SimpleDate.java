package com.example.basics.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); //timestamp

        SimpleDateFormat dataformat = new SimpleDateFormat("HH:mm:ss dd.MM.YY");
        System.out.println(dataformat.format(date));

    }
}


// formatowanie daty
// Y  - rok jako liczby np 2021
// M - miesiąc w roku np.Jan czy 01
// d - dzień np. 10
// h - godzina (1-12) np 6
// H - godzina (0-23) np. 15
// m - minuta np 45
// s - sekunda np 56
// S - milisekunda np 456
// E - dzień tygodnia np pon.
// D - dzień roku np 123
// w - numer tygodnia roku np 3
// W - numer tyhodnia w miesiącu np 2
// a - A.M // P.M np PM
// z - time zone np Eastern Standard Time

// Formatowanie danych w printf
// c - pełna data z czasem
// F - data według formatu ISO 2020-03-03
// D - format US 03/12/2020
// T - godzina format 24h 19:03:59
// r - godzina format 12h
// R - godzina 24H bez sekund
// y - rok - 19
// Y - rok - 2020
// B - pełny miesiąc grudzień
// b - skrócony miesiąc - gru
// m - miesiąc 2 cyfry - 02
// d - dzień 2 cyfry - 23
// e - dzien bez zer - 3
// A - dzień tygodnia: poniedziałek
// a - skrócony dzień tygodnia: pon
// H - godzina 2 cyfry 24h: 07
// k - godzina bez zer 24h: 18
// M - Minuty 2 cyfry: 05
// S - sekundy 2 cyfry: 09
// p - pm/am
// s - timestamp od 01.01.1970
// Q - milisekundy od 01.01.1970


