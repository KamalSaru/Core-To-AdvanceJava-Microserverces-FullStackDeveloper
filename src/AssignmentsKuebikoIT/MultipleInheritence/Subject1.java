package AssignmentsKuebikoIT.MultipleInheritence;


class Subject1 {
    public void print_English(){
        System.out.println("English");
    }
}
class Subject2 extends Subject1 {
    public void print_Math(){
        System.out.println("Math");
    }
}
 class Subject3 extends Subject2{
    public void print_Science(){
        System.out.println("Science");
    }
 }
