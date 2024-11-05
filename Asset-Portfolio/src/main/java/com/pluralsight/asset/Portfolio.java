package com.pluralsight.asset;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<FixedAsset> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public ArrayList<FixedAsset> add(FixedAsset asset) {
        return null;
    }

    public double getValue() {
        return 0;
    }
}