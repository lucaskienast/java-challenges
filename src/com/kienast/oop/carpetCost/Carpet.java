package com.kienast.oop.carpetCost;

public class Carpet {

    private double cost;

    public Carpet() {
        this(0);
    }

    public Carpet(double cost) {
        this.cost = (cost < 0 ) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = (cost < 0 ) ? 0 : cost;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "cost=" + cost +
                '}';
    }
}
