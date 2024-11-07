package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // Constructor
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Getter methods
    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    // Override getValue to return the value of the house
    @Override
    public double getValue() {
        double basePricePerSquareFoot = 200; // Example base price per sq
        double ageAdjustment = 1.0 - (2024 - yearBuilt) * 0.01;  // House depreciation
        double bedroomMultiplier = 1.05 * bedrooms; // More bedrooms = more value

        double value = getMarketValue() + (squareFeet * basePricePerSquareFoot * ageAdjustment * bedroomMultiplier);
        return value;
    }
}