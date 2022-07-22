package com.syntax.class25;

public class Main1 {
    public static void main(String[] args) {
        EncapsulationDemo1 demo1=new EncapsulationDemo1();
        demo1.setEmpName("Mario");
        demo1.setEmpAge(32);
        System.out.println(demo1.getEmpName());
        System.out.println(demo1.getEmpAge());
    }
}
class EncapsulationDemo1{
    private String empName;
    private int empAge;

    public String getEmpName() {
        return "Employee Name: "+empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;

    }

    public String getEmpAge() {
        return "Employee age "+empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;

    }
}
