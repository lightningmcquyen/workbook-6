package com.pluralsight.finance;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    // Constructor to initialize the name and marketValue
    public FixedAsset(String name, double marketValue) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Asset name cannot be null or empty");
        }
        if (marketValue < 0) {
            throw new IllegalArgumentException("Market value cannot be negative");
        }
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

    // toString() method to provide a string representation of the asset
    @Override
    public String toString() {
        return "Fixed Asset: " + name + ", valued at $" + marketValue;
    }
}