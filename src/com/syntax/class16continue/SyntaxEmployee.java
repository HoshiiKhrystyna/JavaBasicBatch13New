package com.syntax.class16continue;

public class SyntaxEmployee {
    int empID;
    double salary;
    static String CEO="Sumair";

    public static void main (String[] args){
        SyntaxEmployee se=new SyntaxEmployee();
        se.empID=12;
        se.salary=13000;
        System.out.println("ID no "+se.empID);
        System.out.println("Salary is "+se.salary);
        System.out.println("CEO "+ SyntaxEmployee.CEO);

        SyntaxEmployee se2=new SyntaxEmployee();
        se2.empID=13;
        se2.salary=15000;
        System.out.println("ID no "+ se2.empID);
        System.out.println("Salary is "+se2.salary);
        System.out.println("CEO "+ SyntaxEmployee.CEO);
    }
}
