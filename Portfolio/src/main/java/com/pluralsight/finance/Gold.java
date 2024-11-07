package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }


    @Override
    public double getValue() {
        // based on its weight and market value
        return getMarketValue() * weight;
    }
}