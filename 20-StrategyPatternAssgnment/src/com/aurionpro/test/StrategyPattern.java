package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.TechLead;

public class StrategyPattern {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Karan", new SeniorConsultant());
		Employee e2 = new Employee(201, "Raj", new Consultant());
		System.out.println("Before promotion");
		System.out.println(e1.getDescription());
		System.out.println(e1.getResponsibilitty());
		System.out.println("-----------------------------------");
		e1.Promote(new TechLead());
		System.out.println("After Promotion");
		System.out.println(e1.getDescription());
		System.out.println(e1.getResponsibilitty());
	}

}
