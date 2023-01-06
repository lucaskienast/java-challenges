package com.kienast.concurrency.extras.atomicOperations;

public class MaxThread extends Thread {

    private final MinMaxMetrics minMetrics;

    public MaxThread(MinMaxMetrics minMetrics) {
        this.minMetrics = minMetrics;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double maxValue = minMetrics.getMax();
            System.out.println("Max value: " + maxValue);
        }
    }
}
