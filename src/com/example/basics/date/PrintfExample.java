package com.example.basics.date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {

        System.out.printf("Hello %s %d %f %b %n %tc , to była data.", "World", 12, 5.6f, true, new Date());

        System.out.printf("%n%nHello %s %2$tY.%2$tm.%2$td", "World", new Date());

        String str = String.format("%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);

        // instancja czasu %1$t
    }
}

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

