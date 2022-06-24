package com.syntax.class16continue;
import com.syntax.class17.Employee;
public class EmployeeTester {
    public static void main (String [] args){
        Employee em=new Employee();
        em.name="Merve";
        //em.salary=25000 we can't access it, because it
        //em.department="IT" because we can't access
        System.out.println(Employee.manager);
        Employee.printManager();
    }

}
