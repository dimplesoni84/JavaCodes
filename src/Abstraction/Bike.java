package Abstraction;

abstract class Bike {
    Bike(){
        System.out.println("Bike is created");

    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changes");
    }
}
class Honda4 extends Bike{
    void run(){
        System.out.println("running");
    }
}
class Test{
    public static void main(String[] args) {
        Bike obj=new Honda4();
        obj.run();
        obj.changeGear();
    }
}
