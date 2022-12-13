package com.kienast.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerMain {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer = new MyConsumer(buffer, ThreadColor.ANSI_RED);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();
    }

}
