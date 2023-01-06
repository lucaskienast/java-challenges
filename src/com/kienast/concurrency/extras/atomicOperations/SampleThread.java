package com.kienast.concurrency.extras.atomicOperations;

import java.util.Random;

public class SampleThread extends Thread {

    private final MinMaxMetrics minMetrics;
    private final Random random = new Random();

    public SampleThread(MinMaxMetrics minMetrics) {
        this.minMetrics = minMetrics;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double sample = random.nextDouble(10000);
            minMetrics.addSample(sample);
        }
    }
}
