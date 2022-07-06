package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subject=new ArrayList<>();
        subject.add("SDLC");//
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add(1,"Jira");
        System.out.println(subject.indexOf("Java"));//return the index of java which is 2
        System.out.println(subject.size());//tells us total numbers of elements in the array
        subject.remove("Git");
        System.out.println("subject = "+ subject);

        System.out.println("subject = " + subject);//soutv

      //  for (String s : subject) {//iter
         //   System.out.println("subject = " + s);
       // }
        System.out.println(subject.contains("Selenium"));

        System.out.println("subject = " + subject.get(0));
        System.out.println("subject = " + subject);
        subject.clear();
        System.out.println("subject = " + subject);
        }

    }

