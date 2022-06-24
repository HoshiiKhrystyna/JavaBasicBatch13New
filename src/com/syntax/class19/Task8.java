package com.syntax.class19;

public class Task8 {
String author;
int pageCount;
Task8(String author){
    this.author=author;

}
   Task8(String author, int pageCount){
    this.pageCount=pageCount;
   }


   public static void main (String[] args){
    Task8 book1=new Task8("Harry Potter");
       Task8 book2=new Task8("Harry Potter",400);
   }
}
