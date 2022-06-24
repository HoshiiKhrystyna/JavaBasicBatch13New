package com.syntax.class22;

public class HWTask2 {
    public static void main (String [] args){
        CreditCard credit=new CreditCard(5000,2.5);
        credit.calculateInterest();
        Visa visa=new Visa(5000,2.5);
        visa.calculateInterest();
        AX ax=new AX(5000,2.5);
        ax.calculateInterest();
    }
}
class CreditCard{
    double balance;
    double interest;
    CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){
        double result=balance*(interest/100);
        System.out.println("Credit card- " +result);
    }
}
class Visa extends CreditCard {
    Visa(double balance, double interest) {

        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double result = (balance * (interest / 100)) + 1;
        System.out.println("Visa -" + result);
    }
}
class AX extends CreditCard{
    AX(double balance, double interest ){
        super(balance,interest);
    }
    @Override
    void calculateInterest(){
        double result=balance*(interest/100)+2;
        System.out.println("AX -"+result);
    }
}