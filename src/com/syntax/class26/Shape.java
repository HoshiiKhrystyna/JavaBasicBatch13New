package com.syntax.class26;

interface Shape {
    void calculateArea(double s);void calculatePerimiter(double s);
}
class Circle implements Shape{
    @Override
    public void calculateArea(double s) {
double area=Math.PI*Math.pow(s,2);
        System.out.println(area);}
    @Override
    public void calculatePerimiter(double s) {
double perimeter=2*Math.PI*s;
        System.out.println(perimeter);
    }}
class Square implements Shape{
    @Override
    public void calculateArea(double s) {
        double area=s*s;
        System.out.println(area);}
    @Override
    public void calculatePerimiter(double s) {
double perimeter=4*s;
        System.out.println(perimeter);}
}
class Tester{
    public static void main(String[] args) {
       Shape[] shape={new Circle(),new Square()};
       for(Shape s:shape){
           s.calculateArea(11);
           s.calculatePerimiter(2);
       }}}
