package com.kienast.concurrency;

public class Worker {

    private final String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public synchronized void work(SharedResource sharedResource, Worker otherWorker) {
        while (active) {
            if (sharedResource.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                }
                continue;
            }

            if (otherWorker.isActive()) {
                System.out.println(this.getName() + " : give the resource to the worker " + otherWorker.getName());
                sharedResource.setOwner(otherWorker);
                continue;
            }

            System.out.println(this.getName() + " : working on the current resource");
            setActive(false);
            sharedResource.setOwner(otherWorker);
        }
    }
}
