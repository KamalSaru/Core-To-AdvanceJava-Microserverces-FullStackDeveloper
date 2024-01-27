package Abstraction;

//Abstraction can one time extend but Interface can multiple time
//Before we need to extend and we can implement
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("-Data abstraction is the process of hiding certain details and showing only essential information to the user.");
        System.out.println("-Abstract class: is a restricted class that cannot be used to create objects.");
        System.out.println("-An abstract class can have both abstract and regular methods.");
        System.out.println("-Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass.");
        System.out.println("------------------------");

        Laptop sc=new Specification();
        sc.brand();
        sc.color();
        sc.price();
        sc.memory();
        sc.ram();

        Laptop c = new AvailableAt();
        c.amazon();
        c.bestbuy();
        System.out.println("To abstract the class, we use extend keyword.");
        System.out.println("Thank you for visiting this site.");
    }
}
