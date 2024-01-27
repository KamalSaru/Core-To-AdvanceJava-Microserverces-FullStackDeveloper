package Abstraction;

public  abstract class Laptop {
    void brand(){
        System.out.println("My best brand is Mac.");
    }

    void color(){
        System.out.println("I love silver color.");
    }

    void price(){
        System.out.println("Price of the laptop is $1200.");
    }

    abstract void memory();
    abstract void ram();
    abstract void amazon();
    abstract void bestbuy();
}
