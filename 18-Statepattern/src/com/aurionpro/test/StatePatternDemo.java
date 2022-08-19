package com.aurionpro.test;

import com.aurionpro.model.Controller;

public class StatePatternDemo {
	 Controller controller;  
     StatePatternDemo(String con) {  
        controller = new Controller();  
        if(con.equalsIgnoreCase("management"))  
           controller.setManagementConnection();  
        if(con.equalsIgnoreCase("sales"))  
           controller.setSalesConnection();  
        if(con.equalsIgnoreCase("accounting"))  
               controller.setAccountingConnection();  
        controller.open();  
        controller.log();  
        controller.close();  
        controller.update();  
     }  
       
}
