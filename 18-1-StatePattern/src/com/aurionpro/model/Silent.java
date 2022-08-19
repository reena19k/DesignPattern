package com.aurionpro.model;

class Silent implements IMobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
        System.out.println("silent...");
    }

}
