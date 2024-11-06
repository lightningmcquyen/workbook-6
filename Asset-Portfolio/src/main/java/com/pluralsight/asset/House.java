package com.pluralsight.asset;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        double baseValue = getMarketValue();
        double sizeValue = baseValue * (squareFeet / 1000.0);  // Example adjustment for square footage
        double bedroomValue = bedrooms * 5000;  // Example adjustment for number of bedrooms
        int currentYear = 2024;
        double ageAdjustment = 1 - (0.01 * (currentYear - yearBuilt));  // Example adjustment for age
        ageAdjustment = Math.max(ageAdjustment, 0);  // Ensure no negative adjustment
        return (sizeValue + bedroomValue) * ageAdjustment;
    }
}