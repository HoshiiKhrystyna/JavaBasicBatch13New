package com.syntax.class19;

public class Task3 {

    private static String getVowels(String input){

        return input.replaceAll("[^aeiouAEIOU]","");
    }
    public static void main (String[] args){
        System.out.println(getVowels("Emre"));
    }
}
