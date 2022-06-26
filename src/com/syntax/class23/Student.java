package com.syntax.class23;

public class Student {
     void study(){
         System.out.println("If you student you need to teach your subjects");
     }
     void doTest(){
         System.out.println("Students need to do tests every week");
     }
     void doHW(){
         System.out.println("All students must to do HW");
     }
}
class SyntaxStudent extends Student{
    void study(){

        System.out.println("If you syntax student you need to teach java");
    }
}
class CollegeStudent extends Student{
    void doTest(){
        System.out.println(" College Students need to do tests every week");
    }
}
class SchoolStudent extends Student{
    void doHW(){
        System.out.println("All school students must to do HW");
    }
}
class StudentTester {
    public static void main(String[] args) {
        Student[] students = { new Student(),new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student stu : students) {
            stu.study();
            stu.doTest();
            stu.doHW();
        }

    }
}