package com.syntax.class17;

public class TeacherTester {
    public static void main (String[] args){
        Teacher teacher=new Teacher();
        teacher.name="Khryst";
        teacher.schoolName="Harvard";
        teacher.printInfo();//because printInfo is public
        //we can call it in other classes and because it the part of
        //teacher class it can access the private fields
        //which in turn let us access these fields
    }
}
