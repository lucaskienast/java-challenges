package com.kienast.oop.printer;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < -1 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100 || this.tonerLevel + tonerAmount > 100) {
            this.tonerLevel = -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        this.pagesPrinted += (this.duplex) ? roundUpToWholePages(pages/2) : pages;
        return this.pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    private int roundUpToWholePages(double pages) {
        return (pages > (int) pages) ? (int) pages + 1 : (int) pages;
    }
}
