package com.kienast.concurrency.extras.threadCoordination;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        PowerCalculatingThread t1 = new PowerCalculatingThread(new BigInteger(String.valueOf(5)), new BigInteger(String.valueOf(6)));
        PowerCalculatingThread t2 = new PowerCalculatingThread(new BigInteger(String.valueOf(4)), new BigInteger(String.valueOf(5)));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BigInteger result = t1.getResult().add(t2.getResult());
        System.out.println(result);
    }

}
