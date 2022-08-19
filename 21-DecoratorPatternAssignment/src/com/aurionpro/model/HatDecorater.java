package com.aurionpro.model;

public class HatDecorater implements IHat {
    IHat hatType;

    public HatDecorater(IHat hatType) {
        this.hatType = hatType;
    }

    @Override
    public String getName() {
        return hatType.getName();
    }

    @Override
    public String getPrice() {
        return hatType.getPrice();
    }

    @Override
    public String getDescription() {
        return hatType.getDescription();
    }
}

