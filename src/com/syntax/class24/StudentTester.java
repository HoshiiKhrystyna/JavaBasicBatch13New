package com.syntax.class24;

public class StudentTester {
    public static void main (String [] args){
        Student [] students={new SyntaxStudent(),new CollegeStudent(), new SchoolStudent()};
        for(Student st:students){
            st.study();
            st.practice();
            st.doHW();
        }
        System.out.println("======================================================");
        for(int i=0; i<students.length; i++){
            students[i].study();
            students[i].doHW();
            students[i].practice();
        }
    }
}
