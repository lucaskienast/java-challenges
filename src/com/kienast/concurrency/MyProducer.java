package com.kienast.concurrency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import static com.kienast.concurrency.ProducerConsumerMain.EOF;

public class MyProducer implements Runnable {

    //private final List<String> buffer;
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    //private final ReentrantLock bufferLock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color/*, ReentrantLock bufferLock*/) {
        this.buffer = buffer;
        this.color = color;
        //this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String n : nums) {
            try {
                /*
                synchronized (buffer) {
                    System.out.println(color + "Adding..." + n);
                    buffer.add(n);
                }
                 */
                //bufferLock.lock();
                System.out.println(color + "Adding..." + n);
                buffer.put(n);
                /*
                try {
                    buffer.add(n);
                } finally {
                    //bufferLock.unlock();
                }
                 */
                Thread.sleep(random.nextInt(1000));
            } catch(InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        /*
        synchronized (buffer) {
            System.out.println(color + "Adding EOF and exiting...");
            buffer.add(EOF);
        }
         */
        //bufferLock.lock();
        System.out.println(color + "Adding EOF and exiting...");

        try {
            buffer.put(EOF);
            //buffer.add(EOF);
        } catch (InterruptedException e) {
            System.out.println("Producer was interrupted at EOF insertion");
        }finally {
           //bufferLock.unlock();
        }
    }
}
