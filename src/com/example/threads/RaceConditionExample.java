package com.example.threads;

public class RaceConditionExample {
    public int counter = 0;

    public void increment() {
        this.counter++;
    }
    public static void main(String args[])
            throws InterruptedException {

        RaceConditionExample example = new RaceConditionExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 200000; i++) {
                    example.increment();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 200000; i++) {
                    example.increment();
                }

            }
        });

        thread1.start();   //poczekamy az ten wątek sie skonczy
        thread2.start();
        thread1.join();    // dzieki temu bedziemy pewni ze po wywołaniu tej metody join kod wątku main
                          // wywoła sie wtedy kiedy ten wątek pieerwszy zakonczy swoje dzialanie
        thread2.join();

        System.out.println("Counter: " + example.counter);

    }
}
