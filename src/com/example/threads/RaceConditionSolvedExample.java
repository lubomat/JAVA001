package com.example.threads;

public class RaceConditionSolvedExample {
    public int counter = 0;

    public synchronized void increment() { // niezaleznie ile bedzie wątkow zawsze wirtualmaszyna gwarantuje ze
                                          // tylko 1 wątek bedzie w stanie w tym samym czasie uzyc tej metody,reszta czeka w kolejce
        this.counter++;
    }
    public static void main(String args[])
            throws InterruptedException {

        RaceConditionSolvedExample example = new RaceConditionSolvedExample();

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

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Counter: " + example.counter);

    }
}
