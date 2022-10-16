package com.kienast.oop.car;

public class Holden extends Car {


    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Holden  " + this.getName() + " engine is starting.";
    }

    @Override
    public String accelerate() {
        return "The Holden " + this.getName() + " car is accelerating.";
    }

    @Override
    public String brake() {
        return "The Holden " + this.getName() + " car is braking.";
    }
}
