package com.syntax.class25;

public class Main {
    public static void main(String[] args) {
        EncapsulationDemo demo=new EncapsulationDemo();
     demo.setEmpName("John");
     demo.setEmpAge(30);
    }
}
class EncapsulationDemo{
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
         this.empName = empName;
        System.out.println("Employee Name: "+empName);
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
        System.out.println("Employee Age: "+empAge);
    }
}
