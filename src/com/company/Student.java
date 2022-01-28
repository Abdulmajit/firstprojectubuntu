package com.company;

import com.company.service.Admin;

public class Student implements Admin {
    private String name;

    public Student(){}
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void regstration() {
        System.out.println("You are registered");
    }

    @Override
    public void check() {
        System.out.println("In array don't have any place to join");
    }

    @Override
    public void check2() {
        System.out.println("You are already in the array");
    }

    @Override
    public void delete() {
        System.out.println("Array is empty");
    }
}