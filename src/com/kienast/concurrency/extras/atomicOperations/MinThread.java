package com.kienast.concurrency.extras.atomicOperations;

public class MinThread extends Thread {

    private final MinMaxMetrics minMetrics;

    public MinThread(MinMaxMetrics minMetrics) {
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
            double minValue = minMetrics.getMin();
            System.out.println("Min value: " + minValue);
        }
    }
}
