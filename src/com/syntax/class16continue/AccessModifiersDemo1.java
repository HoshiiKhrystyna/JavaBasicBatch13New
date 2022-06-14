package com.syntax.class16continue;

public class AccessModifiersDemo1 {
   private String password="pass123";
    int SSN=1234567;
    public String name="Karla";
    public static void main (String[] args){
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.SSN);
        System.out.println(ac.name);


    }
}
