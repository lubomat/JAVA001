package com.example.threads.lifeycle;

public class RunnableState {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 10; i > 0; i--) {
                    try {
                        Thread.sleep(100);
                        System.out.println("i: " + i);
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();  // bez tego bedzie NEW
        System.out.println("Stan wątku: " + thread.getState());
    }
}
