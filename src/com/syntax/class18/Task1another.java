package com.syntax.class18;

public class Task1another {

    public static int sumArray(int [] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String [] args){
        Task1another task1=new Task1another();
        int arr[]={1,2,3,4};
        System.out.println("sum of array "+task1.sumArray(arr));


    }
}
