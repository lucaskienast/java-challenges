package com.kienast.oop.car;

public class Ford extends Car {


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford  " + this.getName() + " engine is starting.";
    }

    @Override
    public String accelerate() {
        return "The Ford " + this.getName() + " car is accelerating.";
    }

    @Override
    public String brake() {
        return "The Ford " + this.getName() + " car is braking.";
    }
}
