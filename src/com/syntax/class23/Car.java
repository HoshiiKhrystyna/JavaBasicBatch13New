package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use key to start");
    }

    void stop (){
            System.out.println("Use breaks to stop me ");
        }
        void park(){
            System.out.println("you can park me manually");
        }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("you can use push start button to start me ");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking or manual brakes to stop me");
    }


}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("You can start me from app");
    }

    @Override
    void stop() {
        System.out.println("Auto break to stop me");
    }

    @Override
    void park() {
        System.out.println("I can park myself");
    }
}
class Toyota extends Car{

}