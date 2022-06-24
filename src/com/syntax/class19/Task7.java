package com.syntax.class19;

public class Task7 {
String name;
String address;
Task7(String name, String address){
    this.name=name;
    this.address=address;

}
void displayInfo(){
    System.out.println(name+" "+address);
}
public static void main (String[] args){
    Task7 task=new Task7("Pavlo","Chicago ,Il ");
    task.displayInfo();
}
}
