package com.syntax.class18;

public class Task1 {

    static int[] arr = {1, 2, 3, 4};


    static int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
            return sum;
        }
        public static void main (String [] args){
            System.out.println("Sum of array "+sum());
        }
    }




