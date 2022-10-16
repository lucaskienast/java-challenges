package com.kienast.oop.burgers;

public class HealthyBurger extends Hamburger {

    private String healthyAddOn1Name;
    private double healthyAddOn1Price;
    private String healthyAddOn2Name;
    private double healthyAddOn2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAddOn1Name = name;
        this.healthyAddOn1Price = (price < 0) ? 0 : price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAddOn2Name = name;
        this.healthyAddOn2Price = (price < 0) ? 0 : price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (healthyAddOn1Name != null) {
            System.out.println("Added " + healthyAddOn1Name + " for an extra " + healthyAddOn1Price);
        }
        if (healthyAddOn2Name != null) {
            System.out.println("Added " + healthyAddOn2Name + " for an extra " + healthyAddOn2Price);
        }
        return totalPrice + healthyAddOn1Price + healthyAddOn2Price;
    }
}
