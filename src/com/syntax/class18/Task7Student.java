package com.syntax.class18;

public class Task7Student {
String name;
String address;

  public Task7Student(String name, String address) {
      this.name = name;
      this.address = address;
  }

public void displayInfo(){
    System.out.println("Student name is "+name+"  and adress "+address);
}

public static void main(String[] args){
      Task7Student student=new Task7Student("Pavlo","1020 S, Schaumburg, Il");
      student.displayInfo();
}

}
