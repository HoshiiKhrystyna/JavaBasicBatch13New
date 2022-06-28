package com.syntax.class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlock();
    void sendText(){
        System.out.println("Use the messing app to send msg");
    }
}
class Iphone extends  Phone{
    void displayPictures(){
        System.out.println("use photo app to display the pictures");
    }
    void unlock(){
        System.out.println("use faceId to unlock the phone");
    }
}
 class Samsung extends Phone{

     @Override
     void displayPictures() {
         System.out.println("use the gallery app to display the pictures");
     }

     @Override
     void unlock() {
         System.out.println("use fingerprint sensor or face to unlock your phone");
     }
 }
class Tester{
    public static void main (String [] args){
       Samsung samsung =new Samsung();
       samsung.displayPictures();
    }
}