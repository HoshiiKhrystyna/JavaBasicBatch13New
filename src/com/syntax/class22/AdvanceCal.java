package com.syntax.class22;

public class AdvanceCal {

    /*  void sum(int num1, int num2){
          System.out.println(num1+num2);
      }
      void sum(int num1, int num2,int num3){
          System.out.println(num1+num2+num3);
      }
      void sum(int num1, int num2,int num3, int num4){
          System.out.println(num1+num2+num3+num4);
      }



     */
    static void sum(int... arr) {
        //System.out.println(arr[0]);
        int sum = 0;
        for (int j : arr) {
            //  System.out.println(arr[i]);
            sum += j;
        }
        System.out.println("Sum of all parameters values " + sum);
    }

    static void printName(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sum(2, 3, 4, 5);
        printName("Pavlo", "Khrystyna", "Sasha");
        int age = 10;
        String name;
        if (age > 18) {
            name = "Time to go work";
        } else {
            name = "Enjoy no Work";
        }
        System.out.println(name);
        String name2=age>18?"Time to go work":"Enjoy no Work";
        System.out.println(name2);
    }
}