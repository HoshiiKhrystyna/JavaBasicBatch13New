package com.syntax.class18;

public class Task3 {

    private static String printVowels(String str) {
        return str.replaceAll("[^aoeiuAOEIU]", "") ;

    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.printVowels("Hello"));
    }
}