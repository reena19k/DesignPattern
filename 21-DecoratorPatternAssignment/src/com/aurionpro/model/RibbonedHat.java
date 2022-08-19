package com.aurionpro.model;

public class RibbonedHat extends HatDecorater{
    public RibbonedHat(IHat changeHat){
        super(changeHat);
    }

    public String getName() {
        ModifyToRibbon();
        return hatType.getName();
    }

    @java.lang.Override
    public String getPrice() {
        ModifyToRibbon();
        return hatType.getPrice();
    }

    @java.lang.Override
    public String getDescription() {
        ModifyToRibbon();
        return hatType.getDescription();
    }
    public void ModifyToRibbon(){
        System.out.println("Hat is Now Ribboned");
    }
}
