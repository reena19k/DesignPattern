package com.aurionpro.model;

class Vibration implements IMobileAlertState 
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
         System.out.println("vibration...");
    }
  
}