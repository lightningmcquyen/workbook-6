package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    // Constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);  // constructor of the superclass <<FixedAsset>>
        this.karat = karat;
    }

    // Getter for karat
    public double getKarat() {
        return karat;
    }

    // Override getValue & return the value of the jewelry
    @Override
    public double getValue() {
        return getMarketValue() * (karat / 24);  // If karat is 24, value = marketValue, if 12, half the value, etc.
    }
}