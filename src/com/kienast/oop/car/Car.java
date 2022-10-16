package com.kienast.oop.car;

public class Car {

    private boolean engine;
    private final int cylinders;
    private final String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = Math.max(cylinders, 0);
        this.name = name;
    }

    public String startEngine() {
        return "The car " + name + " engine is starting.";
    }

    public String accelerate() {
        return "The car " + name + " car is accelerating.";
    }

    public String brake() {
        return "The car " + name + " car is braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
