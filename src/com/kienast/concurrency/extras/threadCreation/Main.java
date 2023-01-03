package com.kienast.concurrency.extras.threadCreation;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("This is r1");
        Runnable r2 = () -> System.out.println("This is r2");
        Runnable r3 = () -> System.out.println("This is r3");

        MultiExecutor multiExecutor = new MultiExecutor(List.of(r1, r2, r3));
        multiExecutor.executeAll();
    }

}
