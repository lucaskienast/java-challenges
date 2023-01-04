package com.kienast.concurrency.extras.threadCreation;

import java.util.List;

public class MultiExecutor {

    private final List<Runnable> tasks;

    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll() {
        tasks.forEach(r -> {
            Thread thread = new Thread(r);
            thread.start();
        });
    }
}
