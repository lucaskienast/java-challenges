package com.kienast.concurrency.extras.atomicOperations;

public class Main {

    public static void main(String[] args) {
        MinMaxMetrics minMaxMetrics = new MinMaxMetrics();

        MinThread minThread = new MinThread(minMaxMetrics);
        MaxThread maxThread = new MaxThread(minMaxMetrics);
        SampleThread sampleThread1 = new SampleThread(minMaxMetrics);
        SampleThread sampleThread2 = new SampleThread(minMaxMetrics);

        minThread.start();
        maxThread.start();
        sampleThread1.start();
        sampleThread2.start();
    }

}
