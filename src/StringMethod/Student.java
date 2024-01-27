package StringMethod;

public class Student {
    public static void main(String[] args) {
        String s = "Kamal";
        String s1 = "Kamal";
        String s3 = new String("Kamal");
        String s4 =new String("Kamal");


        // .equals()-----compare to value
        System.out.println(s.equals(s1));
        System.out.println(" ");
        System.out.println(s3.equals(s4));
        System.out.println(" ");

        //== compare to the memory interface
        System.out.println(s==s1);
        System.out.println(" ");
        System.out.println(s3==s4);
    }
}
