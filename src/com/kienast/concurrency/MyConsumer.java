package com.kienast.concurrency;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import static com.kienast.concurrency.ProducerConsumerMain.EOF;

public class MyConsumer implements Runnable {

    //private final List<String> buffer;
    private final ArrayBlockingQueue<String> buffer;
    private final String color;
    //private final ReentrantLock bufferLock;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color/*, ReentrantLock bufferLock*/) {
        this.buffer = buffer;
        this.color = color;
        //this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        //int counter = 0;

        while(true) {
            /*
            synchronized(buffer) {
                if (buffer.isEmpty())
                    continue;
                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            }
             */

            /*
            bufferLock.lock();
            try {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            } finally {
                bufferLock.unlock();
            }
             */

            /*
            if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }

                    System.out.println(color + "The counter = " + counter);
                    counter = 0;

                    if (buffer.get(0).equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.remove(0));
                    }
                } finally {
                    bufferLock.unlock();
                }
            } else {
                counter++;
            }
             */

            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }
                } catch (InterruptedException e) {
                    System.out.println("Consumer was interrupted");
                }
            }
        }
    }
}
