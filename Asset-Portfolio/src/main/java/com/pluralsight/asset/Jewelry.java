package com.pluralsight.asset;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        double marketValue = 0; //initialize marketValue
        return marketValue;
    }
}