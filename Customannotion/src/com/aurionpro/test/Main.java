package com.aurionpro.test;

import java.lang.reflect.Method;

import com.aurionpro.model.Cat;
import com.aurionpro.model.Dog;
import com.aurionpro.model.RunImmediately;
import com.aurionpro.model.RunSlowly;
import com.aurionpro.model.veryImportant;

public class Main {
	public static void main(String[] args) {
		Dog doggy = new Dog();

		if (doggy.getClass().isAnnotationPresent(veryImportant.class)) {
			System.out.println("Annotation is present here");
		} else {
			System.out.println("Annotation is not present here");
		}
		Method[] methods1 = doggy.getClass().getMethods();

		for (Method method : methods1) {
			RunImmediately annotation = method.getAnnotation(RunImmediately.class);
			if (annotation != null) {
				try {
					for (int i = 0; i < annotation.times(); i++)
						method.invoke(doggy);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		for (Method method : methods1) {
			RunSlowly annotation = method.getAnnotation(RunSlowly.class);
			if (annotation != null) {
				try {
					for (int i = 0; i < annotation.times(); i++)
						method.invoke(doggy);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("-----------------------------------------------------------------");

		Cat catty = new Cat();
		if (catty.getClass().isAnnotationPresent(veryImportant.class)) {
			System.out.println("Annotation is present here");
		} else {
			System.out.println("Annotation is not present here");
		}
		Method[] methods2 = catty.getClass().getMethods();
		for (Method method : methods2) {
			RunImmediately annotation = method.getAnnotation(RunImmediately.class);
			if (annotation != null) {
				try {

					for (int i = 0; i < annotation.times(); i++)
						method.invoke(catty);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		for (Method method : methods2) {
			RunSlowly annotation = method.getAnnotation(RunSlowly.class);
			if (annotation != null) {
				try {

					for (int i = 0; i < annotation.times(); i++)
						method.invoke(catty);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
