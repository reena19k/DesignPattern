package com.aurionpro.test;

import com.aurionpro.model.AndExpression;
import com.aurionpro.model.IExpression;
import com.aurionpro.model.OrExpression;
import com.aurionpro.model.TerminalExpression;

public class Interpretorpattertest {
	public static IExpression getMaleExpression() {
		IExpression ram = new TerminalExpression("ram");
		IExpression shyam = new TerminalExpression("shyam");
		return new OrExpression(ram, shyam);
		
	}
	public static IExpression getMarriedWomenExpression() {
		IExpression julie = new TerminalExpression("Julie");
		IExpression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		IExpression isMale = getMaleExpression();
		IExpression isMarried = getMarriedWomenExpression();
		System.out.println("Ram is male ?" +isMale.interpret("ram"));
		System.out.println("juile is married ?" +isMarried.interpret("Married Julie"));
		
	}

}
