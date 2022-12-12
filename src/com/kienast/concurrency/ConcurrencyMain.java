package com.kienast.concurrency;

import static com.kienast.concurrency.ThreadColor.*;

public class ConcurrencyMain {

    public static void test() {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start(); // do not call run directly
        // anotherThread.start(); -> not allowed to start instance of thread again

        /*
        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous thread");
            }
        }.start();
         */

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the anonymous thread")).start();

        //Thread myRunnableThread = new Thread(new MyRunnable());
        //myRunnableThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from my anonymous runnable.");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();
        //myRunnableThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");
    }

}
