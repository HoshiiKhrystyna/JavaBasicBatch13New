package com.syntax.class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsScreen=new ArrayList<>();
                subjectsScreen.add("SDLC");//
        subjectsScreen.add("Manual Testing");
        subjectsScreen.add("Java");
        subjectsScreen.add("Git");
        subjectsScreen.add("Selenium");

        ArrayList<String> futureSubject=new ArrayList<>();
                futureSubject.add("TestNG");
        futureSubject.add("Cucumber");
        futureSubject.add("TestNG");
        futureSubject.add("SQL");
        futureSubject.add("API");
        futureSubject.add("Jenkins");
        futureSubject.add("Docker");
        futureSubject.add("Apium");

        ArrayList <String> allSubjects=new ArrayList<>();
        allSubjects.addAll(futureSubject);
        allSubjects.addAll(1,subjectsScreen);
        System.out.println("allSubjects = " + allSubjects);

        ArrayList <String> allSubjects2=new ArrayList<>();//ctrl+c
        //shift+end

        allSubjects2.addAll(subjectsScreen);
        //insert the data starting form the index I and will push
        allSubjects2.addAll(1,futureSubject);

    }
}
