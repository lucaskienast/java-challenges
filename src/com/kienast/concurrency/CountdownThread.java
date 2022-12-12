package com.kienast.concurrency;

public class CountdownThread extends Thread {

    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }

}
