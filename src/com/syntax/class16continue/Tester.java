package com.syntax.class16continue;

public class Tester {
    public static void main (String[] args){
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
       // System.out.println(ac.password);error because it private
        //and we can't use outside the classs=

        System.out.println(ac.name);
    }
}
