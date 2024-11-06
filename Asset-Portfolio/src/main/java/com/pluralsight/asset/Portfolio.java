package com.pluralsight.asset;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    // Add asset or liquid account to the portfolio
    public void add(Valuable valuable) {
        valuables.add(valuable);
    }

    // (sum of values of all valuables)
    public double getTotalValue() {
        double totalValue = 0;
        for (Valuable valuable : valuables) {
            totalValue += valuable.getValue();  // getValue() method from Valuable
        }
        return totalValue;
    }
}