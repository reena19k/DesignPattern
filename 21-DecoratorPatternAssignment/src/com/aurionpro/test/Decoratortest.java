package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.StandardHat;

public class Decoratortest {
	public static void main(String[] args) {
		IHat hat1 = new StandardHat();
        System.out.println(hat1.getName());
        System.out.println(hat1.getDescription());
        System.out.println(hat1.getPrice());

        System.out.println("----------------------------");

        IHat hat2 = new GoldenHat(new StandardHat());
        System.out.println(hat2.getName());
        System.out.println(hat2.getDescription());
        System.out.println(hat2.getPrice());


	}

}
