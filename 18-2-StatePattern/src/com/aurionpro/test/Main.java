package com.aurionpro.test;

import com.aurionpro.model.DeliveryContext;

public class Main {
	public static void main(String[] args) {
		DeliveryContext ctx = new DeliveryContext(null, "Test123");
        
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
	}

