package com.syntax.class27;

import com.syntax.class16continue.InstanceDemo;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    String insuranceName;

    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends  Insurance{
String carMode="jEEP";
String insuranceName="Nation";

    @Override
    void getQuote() {
        System.out.println(insuranceName+" and "+carMode+" total 1000 per 6 month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel");
    }
}
class Pet extends Insurance{
    String petType="Dog";
String insuranceName="Pets help";
    @Override
    void getQuote() {
        System.out.println(insuranceName+"  for"+petType+" cost 500 per 1 year");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel");
    }
}
class Health extends Insurance{
String insuranceName="Health";
    @Override
    void getQuote() {
        System.out.println(insuranceName+" for person cost 2000 per year ");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel");
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<Insurance>classes=new ArrayList<>();
        classes.add(new Car());
        classes.add(new Pet());
        classes.add(new Health());

        for (Insurance aClass : classes) {
            aClass.cancelInsurance();
            aClass.getQuote();
        }
Iterator<Insurance> iterator= classes.iterator();
        while(iterator.hasNext()){
           Insurance in= iterator.next();
           in.getQuote();
           in.cancelInsurance();

        }
        for(int i=0; i< classes.size(); i++){
            classes.get(i).getQuote();
            classes.get(i).cancelInsurance();
        }
    }
}
