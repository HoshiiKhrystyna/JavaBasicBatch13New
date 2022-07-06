package com.syntax.class26;

public class Task2 {
    public static void main(String[] args) {
        Marks[] marks = {new A(60, 70, 80), new B(70, 80, 99, 90)};
        for (Marks m : marks) {
            System.out.println(m.getAverage());
        }
    }}
abstract class Marks{
    abstract double getAverage();

}
class A extends Marks{
    double subject1;
    double subject2;
    double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getAverage() {
return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getAverage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}