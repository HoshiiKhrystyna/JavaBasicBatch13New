package com.syntax.class18;

public class Task4Tester {
    public static void main(String[] args){
        Task4 task4=new Task4("Khrystyna","Hoshii",30);
        System.out.println(task4.getInfo());
        Task4 task=new Task4();
        System.out.println("Name "+task.name+" Last name "+
                task.lastName+" age "+task.age);
    }
}
