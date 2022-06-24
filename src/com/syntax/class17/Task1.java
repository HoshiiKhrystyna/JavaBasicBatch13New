package com.syntax.class17;

public class Task1 {
//Create a Class called SyntaxEmployee:
//Create three  variables  empID , salary and set the CEO to “Sumair”
//Create two objects of the class SyntaxEmployee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

  String empID;
  int salary;
  //whenever we are sure that two objects of a class
    //can have different values for a variables
    //or if we have to share that variable between
    //two or more methods of that class we should always go with
    //instance variables
    static String CEO="Sumair";
    public static void main(String[] args){
        Task1 emp=new Task1();
        emp.empID="123";
        emp.salary=24000;
        Task1 emp1=new Task1();
        emp1.empID="124";
        emp1.salary=25000;
        System.out.println(emp.empID);
        System.out.println(emp.salary);
        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(CEO);
    }
}
