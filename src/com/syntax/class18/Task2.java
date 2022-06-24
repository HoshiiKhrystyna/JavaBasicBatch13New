package com.syntax.class18;

public  class Task2 {
   public String reverseString(String str) {
       String reverse="";
       int length=str.length();
       for(int i=length-1;i>=0;i--){
           reverse+=str.charAt(i);
       }
       return reverse;
   }
   public static void main (String[] args){
       Task2 task2=new Task2();
       System.out.println("Reverse "+task2.reverseString("Hello"));
   }
}
