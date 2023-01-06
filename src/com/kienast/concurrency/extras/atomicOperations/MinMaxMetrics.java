package com.kienast.concurrency.extras.atomicOperations;

public class MinMaxMetrics {

    private volatile double minValue;
    private volatile double maxValue;

    public MinMaxMetrics() {
        minValue = Double.MAX_VALUE;
        maxValue = Double.MIN_VALUE;
    }

    public void addSample(double sample) {
        synchronized (this) {
            minValue = Math.min(minValue, sample);
            maxValue = Math.max(maxValue, sample);
        }
    }

    public double getMin() {
        return minValue;
    }

    public double getMax() {
        return maxValue;
    }
}
