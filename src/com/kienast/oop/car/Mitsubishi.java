package com.kienast.oop.car;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Mitsubishi  " + this.getName() + " engine is starting.";
    }

    @Override
    public String accelerate() {
        return "The Mitsubishi " + this.getName() + " car is accelerating.";
    }

    @Override
    public String brake() {
        return "The Mitsubishi " + this.getName() + " car is braking.";
    }
}
