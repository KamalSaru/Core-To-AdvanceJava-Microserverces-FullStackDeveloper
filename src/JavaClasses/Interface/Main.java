package JavaClasses.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Another way to achieve abstraction in Java is with interfaces.");
        System.out.println("An interface is a completely abstract class that is used to group related methods with empty bodies.");
        System.out.println("----------------------");

        Pig myPig =new Pig();
        myPig.animalSound();
        myPig.sleep();

        System.out.println("To access the interface method, the interface must be implemented by another class with implements keyword.");
    }
}
