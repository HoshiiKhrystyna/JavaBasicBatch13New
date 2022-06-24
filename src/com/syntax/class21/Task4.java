package com.syntax.class21;

public class Task4 {

    private void method(){
        System.out.println("Private 1");
    }
    private void method(int num){
        System.out.println("Private "+num);
    }
    private void method(String str, int num){
        System.out.println(str+num);
    }
    public static void main (String [] args){
        Task4 task4=new Task4();
        task4.method();
        task4.method(2);
        task4.method("Private ",3);
    }
}
