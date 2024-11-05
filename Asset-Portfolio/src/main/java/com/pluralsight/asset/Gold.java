package com.pluralsight.asset;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        double marketValue = 0;
        return marketValue;
    }
}