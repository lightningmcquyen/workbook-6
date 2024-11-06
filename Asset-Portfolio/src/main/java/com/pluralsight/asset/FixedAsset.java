package com.pluralsight.asset;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getMarketValue() {
        return marketValue;
    }

    // Abstract method to get the value of the asset
    @Override
    public abstract double getValue();
}