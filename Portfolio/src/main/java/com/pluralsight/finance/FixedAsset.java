package com.pluralsight.finance;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    // Constructor to initialize the name and marketValue
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marketValue
    public double getMarketValue() {
        return marketValue;
    }

    // Abstract method to be implemented by subclasses
    public abstract double getValue();
}