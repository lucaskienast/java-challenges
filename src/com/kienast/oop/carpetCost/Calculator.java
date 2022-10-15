package com.kienast.oop.carpetCost;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator() {
        this(new Floor(), new Carpet());
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "floor=" + floor +
                ", carpet=" + carpet +
                '}';
    }
}
