package JavaClasses.Inheritance.MultipleInheritences;


class Subject1 {
    public void print_English(){
        System.out.println("English");
        System.out.println("Need to learn fast.");
    }
}
class Subject2 extends Subject1 {
    public void print_Math(){
        System.out.println("Math");
        System.out.println("Math is the best.");
    }
}
class Subject3 extends Subject2 {
    public void print_Science(){
        System.out.println("Science");
        System.out.println("I love science.");
    }
}

//Extend in order of class--
class Subject4 extends Subject3{
    public void print(){
        System.out.println("Continue..............");
    }
}

public class Main {
    public static void main(String[] args) {
        //Last subject need to create the object--Subject4
       Subject4 sb= new Subject4();
        sb.print_English();
        System.out.println("................");
        sb.print_Science();
        sb.print_Math();
        sb.print();
    }
}

