package com.example.basics;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckExample {
    public static void main(String[] args) {

        //odczytywanie tekstu z internetu

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();   //dostep do strumienia bajtów z tego url
            BufferedReader bufferedReader = new BufferedReader(   //ten konstruktor umozliwi odczytanie linijka po linice a nie bajt po bajcie
                    new InputStreamReader(is)
            );

            String line = null;
            while( (line = bufferedReader.readLine() ) !=null) {  // odczytamy linnijke tekstu z tego strumienia
                System.out.println(line);
            }

        }
            catch (Exception e) {   //wyjątek
            e.printStackTrace();
        }
    }
}
