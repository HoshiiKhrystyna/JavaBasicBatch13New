package com.syntax.class26;

public interface MoveAble {
    void move();
}
class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("a car can move");
    }
    public void park(){
        System.out.println("You can park me");
    }
}
class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class Test {
    public static void main(String[] args) {

        MoveAble moveAble = new Car();//widening
        moveAble.move();
        ((Car)(moveAble)).park();//narrowing
//with interfaces we also use polimorphism
        MoveAble[] moveAbles={new Car(),new Person()};
        for(MoveAble moveAble1:moveAbles){
            moveAble1.move();
        }
    }
}