package com.syntax.class26;

public class Encapsulation {
    private String empName="John";

    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public static void main(String[] args) {
        Encapsulation en=new Encapsulation();
        System.out.println("Employee Name: "+en.getEmpName());
        System.out.println("Employee Age: "+en.getEmpAge());
    }
}

