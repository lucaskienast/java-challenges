package com.kienast.concurrency;

import java.util.Random;

public class Writer implements Runnable {

    private final Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
                "First Message",
                "Second Message",
                "Third Message",
                "Fourth Message",
        };

        Random random = new Random();

        for (String s : messages) {
            message.write(s);
            //System.out.println("Wrote message: " + s);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }

        message.write("Finished");
    }
}
