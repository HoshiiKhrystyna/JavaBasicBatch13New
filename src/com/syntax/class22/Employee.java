package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=10;

    void calculateprintSalary(){
        System.out.println(baseSalary);
    }
    void calculateprintHolidays(){
        System.out.println(baseHolidays);
    }
}
class Manager extends Employee{
    @Override
    void calculateprintSalary(){
        System.out.println((baseSalary*2)+30000);
    }
    void calculateprintHolidays(){
        System.out.println(baseHolidays*3);
    }
}
class QA extends Employee{
    void calculateprintSalary(){
        System.out.println(baseSalary*2+20000);
    }
    void calculateprintHolidays(){
        System.out.println(baseHolidays*3);
    }
}