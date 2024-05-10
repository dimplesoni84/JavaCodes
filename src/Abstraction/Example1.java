package Abstraction;
 abstract class Example1 {
    abstract void run();
}
class Honda extends Example1{
     void run(){
         System.out.println("Running Safely");
     }

    public static void main(String[] args) {
        Example1 obj=new Honda();
        obj.run();
    }
}
