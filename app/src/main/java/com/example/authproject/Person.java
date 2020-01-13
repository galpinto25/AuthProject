package com.example.authproject;

public class Person {
    private String name;
    private int age;

    public Person() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
