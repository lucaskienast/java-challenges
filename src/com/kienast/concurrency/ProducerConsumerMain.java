package com.kienast.concurrency;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerMain {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        //List<String> buffer = new ArrayList<>();
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);
        //ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5 /*3*/);

        /*
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN, bufferLock);
        MyConsumer consumer = new MyConsumer(buffer, ThreadColor.ANSI_RED, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE, bufferLock);
         */

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer = new MyConsumer(buffer, ThreadColor.ANSI_RED);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);

        /*
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();
         */

        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_CYAN + "I'm printed form the Callable!");
                return "This is the callable result";
            }
        });

        try {
            System.out.println("Future Result Start");
            System.out.println(future.get());
            System.out.println("Future Result End");
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();
    }

}
