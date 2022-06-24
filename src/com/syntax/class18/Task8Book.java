package com.syntax.class18;

public class Task8Book {
    String bookName;
    double price;
    String author;
    public Task8Book(){
        System.out.println(" no parameters constructor");
    }
    public Task8Book(String bookName, double price, String author){
        this.bookName=bookName;
        this.author=author;
        this.price=price;
        System.out.println(" 3 variables constructor");
    }
    public void allInfo(){
        System.out.println(bookName+" price is "+price+" the author "+author);
    }
   public static void main (String[] args){
        Task8Book book=new Task8Book("Harry Potter",13.99,"J.K.Rowling");
book.allInfo();
   }

}
