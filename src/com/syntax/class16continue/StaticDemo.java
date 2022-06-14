package com.syntax.class16continue;

public class StaticDemo {
   static int noOfEmployees=10;
    String name;
    static void method1(){
        System.out.println(noOfEmployees);
    }
    void method2(){

    }
    public static void main(String [] args){
      StaticDemo st=new StaticDemo();
      st.name="Omid";
        StaticDemo st2=new StaticDemo();
        st.name="Rashid";
    }
}
