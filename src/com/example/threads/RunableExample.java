package com.example.threads;

import java.util.stream.Stream;

class RunnableClass implements Runnable {
    private int sleepTime;
    private String threadname;

    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadname = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wątek "+ threadname+ ", wartość i:" + i);
            try {
                Thread.sleep(sleepTime);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableClass2 extends RunnableClass implements Runnable { // TODO: 20.02.2023
    private Thread thread;

    public RunnableClass2(int sleepTime, String threadName) {
        super(sleepTime, threadName);

    }

    public void start() {
        if(thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}

public class RunableExample {
    public static void main(String[] args) {
        RunnableClass t1 = new RunnableClass(500,"Thread1");
        Thread thread1 = new Thread(t1,"thread1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(1000,"Thread2");
        Thread thread2 = new Thread(t2,"thread2");
        thread2.start();

        RunnableClass2 t3 = new RunnableClass2(300,"thread3");
        t3.start();
    }
}
