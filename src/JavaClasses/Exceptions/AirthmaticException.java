package JavaClasses.Exceptions;

import java.util.Scanner;

public class AirthmaticException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int num = scanner.nextInt();

        System.out.print("Enter the second number :- ");
        int num1 =scanner.nextInt();
        
        try {
            int sum = num+num1;
            System.out.println("Sum of the number is :- " +sum);

        } catch ( Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }
        finally {
            scanner.close();
            //System.out.println("Continue working...............");
        }
    }
}
