package Static;

public class StudentDetails {
    static String firstName = "Kamal";
    String lastName="Saru";
    String phoneNumber="12456";
     int phone=Integer.parseInt(phoneNumber);//change in int

     static {
         System.out.println("I am java class student.");
     }

     public void address(){
         System.out.println("I live in Baltimore, MD.");
     }

     public static void officeAddress(){
         System.out.println("My office address is Washington DC.");
     }
}
