package StringMethod;

public class stingPractice {
    public static void main(String[] args) {
        String name = "Kamal";
        String name1 = "Kamal";


        String student= new String("Hari");
        String student1= new String( "Hari");

        System.out.println(name.equals(name1));
        System.out.println(student.equals(student1));

        System.out.println(name==name1);
        System.out.println(student==student1);
        System.out.println(name==student);
    }
}
