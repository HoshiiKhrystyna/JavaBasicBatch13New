package com.syntax.class18;

public class Task4 {
    String name;
    String lastName;
    int age;

    Task4 (){
        System.out.println("Constructor without paramiteres ");
    }
    Task4 (String name, String lastName,int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
        String getInfo(){
            return "name= "+name+" lastName = "+lastName+" age= "+age;
        }

    }


