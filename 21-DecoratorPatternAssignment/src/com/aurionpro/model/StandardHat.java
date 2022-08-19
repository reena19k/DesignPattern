package com.aurionpro.model;

public class StandardHat implements IHat{
    @Override
    public String getName() {
        return "Standardh-Hat";
    }

    @Override
    public String getPrice() {
        return "$10 only";
    }

    @Override
    public String getDescription() {
        return "This is a Standard hat";
    }

}
