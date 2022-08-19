package com.aurionpro.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium-Hat";
    }

    @Override
    public String getPrice() {
        return "$450 only";
    }

    @Override
    public String getDescription() {
        return "This is a Premiun hat";
    }
}
