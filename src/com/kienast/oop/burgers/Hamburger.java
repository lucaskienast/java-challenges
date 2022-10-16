package com.kienast.oop.burgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addOn1Name;
    private double addOn1Price;
    private String addOn2Name;
    private double addOn2Price;
    private String addOn3Name;
    private double addOn3Price;
    private String addOn4Name;
    private double addOn4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = (price < 0) ? 0 : price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addOn1Name = name;
        this.addOn1Price = (price < 0) ? 0 : price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addOn2Name = name;
        this.addOn2Price = (price < 0) ? 0 : price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addOn3Name = name;
        this.addOn3Price = (price < 0) ? 0 : price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addOn4Name = name;
        this.addOn4Price = (price < 0) ? 0 : price;
    }

    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " roll, price is "+ price);
        if (addOn1Name != null) {
            System.out.println("Added " + addOn1Name + " for an extra " + addOn1Price);
        }
        if (addOn2Name != null) {
            System.out.println("Added " + addOn2Name + " for an extra " + addOn2Price);
        }
        if (addOn3Name != null) {
            System.out.println("Added " + addOn3Name + " for an extra " + addOn3Price);
        }
        if (addOn4Name != null) {
            System.out.println("Added " + addOn4Name + " for an extra " + addOn4Price);
        }
        return price + addOn1Price + addOn2Price + addOn3Price + addOn4Price;
    }
}
