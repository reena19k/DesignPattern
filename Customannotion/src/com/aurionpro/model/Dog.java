package com.aurionpro.model;
@veryImportant
public class Dog {
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

    @RunImmediately(times = 3)
    public void bark(){
        System.out.println("Bhow Bhow");
    }
    @RunSlowly(times = 2)
    public void eat(){
        System.out.println("Eat this thing");
    }
  

}