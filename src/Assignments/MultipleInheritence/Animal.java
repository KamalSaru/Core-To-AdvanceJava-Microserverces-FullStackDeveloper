package Assignments.MultipleInheritence;

public class Animal {
    void eat(){
        System.out.println("Eating..............");
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Barking...........");
        }
    }

    class BabyDod extends Dog{
        void weep(){
            System.out.println("Weeping................");
        }
    }
class Main{
    public static void main(String[] args) {

    }
  }
}
