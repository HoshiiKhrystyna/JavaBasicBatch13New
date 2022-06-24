package com.syntax.reviewClass1;

public class B13String {
//best p
  private  String str;
public B13String(String str){
    int number;
   // this.number error , this is no instance variable
this.str=str;
}
//write a method that can tell me how many times as characters been
  //  repeated in string

    public int countChars( char c){
    int counter=0;
    for(char cha:str.toCharArray()){
        if(cha==c){
            counter++;
        }
    }
    return counter;
    }


    public void printChars(char c){
    int counter=0;
    for (int i=0; i<str.length(); i++){
        if(str.charAt(i)==c){
            counter++;
        }
    }
        System.out.println(c+" has appeared "+counter+" inside this string");
    }
}
