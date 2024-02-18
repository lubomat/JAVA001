package com.example.threads;

public class AnonymousRunnableExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {   //format klasy anonimowej
            @Override
            public void run() {
                for(int i = 0;i < 5; i++){
                    System.out.println("Wartość i: " + i);
                }

            }
        });

        thread.start();
    }
}


// nowy wątek na bazie klasy anonimowej