package JavaClasses.Abstraction;

public class Specification extends Laptop {

    @Override
    void ram(){
        System.out.println("Ram is 32GB.");
    }

    @Override
    void memory(){
        System.out.println("Memory is 512GB.");
    }

    @Override
    void amazon() {
    }

    @Override
    void bestbuy() {
    }
}
