package com.pluralsight.asset;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    public FixedAsset (String name, double marketValue){
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getMarketValue(){
        return 0;
    }

    public abstract double getValue();
}