package Static;

public class Person {
    int age;
}

class Main{
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        p1.age=31;
        p2.age=37;

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("P1\'s age is : "+p1.age);
        System.out.println("P2\'s age is : "+p2.age);
        System.out.println("-------------------------");
    }
}
