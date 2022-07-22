package com.syntax.class29.Homework;

import java.util.*;

public class HWTask8 {
    public static void main(String[] args) {
Person person=new Person("Pavlo","Hoshii",20,30000);
Person person1=new Person("Khrystyna","Hoshii",30,40000);
Person person2=new Person("Sasha","Goshii",30,60000);
Person person3=new Person("Svitlana","Hovdyzk",50,600000);

TreeMap <String,Person> map=new TreeMap<>();
map.put("123",person);
map.put("124",person1);
map.put("125",person2);
map.put("126",person3);
        Set<Map.Entry<String, Person>> entries=map.entrySet();
        Iterator<Map.Entry<String,Person>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Person> iter = iterator.next();
            System.out.print("ID = "+iter.getKey()+" ");
            iter.getValue().printInfo();
        }


    }
    static class Person{
        private  String name;
        private String lastName;
        private int age;
        private  double salary;

        public Person(String name, String lastName, int age, double salary) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }
        void printInfo(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }
}
