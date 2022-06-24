package com.syntax.class22;

public class HWTask1 {
    public static void main(String[] args) {
        Bachelor bachelor=new Bachelor();
        bachelor.getPrerequisite();
        Master master=new Master();
master.getPrerequisite();
    }
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma ");
    }
        }
class Bachelor extends Degree{
}
class Master extends Degree{
    @Override
            void getPrerequisite(){
                System.out.println("To get a Master you need bachelor diploma ");
            }
        }

