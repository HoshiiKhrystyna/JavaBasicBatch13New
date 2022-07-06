package com.syntax.class26;

public class Demo6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int num3=10;
        int num4=10;
        int num5=10;
        System.out.println(num1+num2+num3+num4+num5);

        //whenver we have to store more than three value of same
       // type which are also logically connected we should
        //create an array for them

        String name="Pavlo";
        String name2="Kat";
        String name3="Adam";
        String name4="Bilal";
        String [] names={"Pavlo","Kat","Adam","Bilal"};
        //not a good fit for an array because data is not same

        String name5="James";
        String address="New York";
        String moveName="Thor";
        String [] arr={"James","New york","Thor"};
        Object [] array={10,51,2,"Asghar"};//very bad idea
        //to use this object array to store
    }
}
