package com.aurionpro.model;

public class Consultant implements IRole{
    @Override
    public String description() {
        return "Consultanting";
    }

    @Override
    public String responsibility() {
        return "Write Code";
    }
}