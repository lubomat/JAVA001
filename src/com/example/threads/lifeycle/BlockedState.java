package com.example.threads.lifeycle;

class SomeThread implements Runnable {

    public static synchronized void test() {
        while(true) {

        }
    }

    @Override
    public void run() {
        test();
    }
}

public class BlockedState {
    public static void main(String[] args)
    throws InterruptedException {         // nie trzeba robic try catch

        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());

        thread1.start();  // wejdzie w nieskonczona petle
        thread2.start();  // bedzie mial krotki czas runnable, zostanie zablokowany
                    //       przez pierwszy wątek ktory wywoła statyczna metode test

        Thread.sleep(100);
        System.out.println("Threa1 state: " + thread1.getState());  // RUNNABLE
        System.out.println("Thread2 state: "+ thread2.getState());  // BLOCKED
    }
}
