package com.aurionpro.model;

public class Cat {
	String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void Meow(){
        System.out.println("Meow Meow");
    }

    @RunImmediately(times = 3)
    public void eat(){
        System.out.println("Eat this thing");
    }


}
