package com.pluralsight.asset;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        double baseValue = getMarketValue();
        double karatValueAdjustment = karat * 0.1; // Adjust value based on karat
        return baseValue * (1 + karatValueAdjustment);
    }
}