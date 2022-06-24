package com.syntax.class18;

public class Task5StudentsTester {

    public static void main (String [] args){
       Task5Students students1=new Task5Students("Khrystyna", 80,
               70,90) ;
       Task5Students students2=new Task5Students("Oleksandr", 90,
                70, 69 ) ;
       Task5Students students3=new Task5Students("Pavlo",90,
                90,90) ;
       Task5Students students4=new Task5Students("Svitlana",90,
               90,76);
       Task5Students students5=new Task5Students("Nataliya",60,
               90,89);

        students1.printAllInfo();
        students2.printAllInfo();
        students3.printAllInfo();
        students4.printAllInfo();
        students5.printAllInfo();
    }
}
