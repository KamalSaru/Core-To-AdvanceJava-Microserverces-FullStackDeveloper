package JavaClasses.Exceptions;

import java.util.Scanner;


//Main 5 key word---try, catch, throw, throws and finally----
public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num :- ");
        int num = scanner.nextInt();

        System.out.println("Num :- ");
        int num1 = scanner.nextInt();

        try {
            int div = num / num1;

            System.out.println("Division of two number :- " + div);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        finally { //not possible to override and finally block
            scanner.close();
            System.out.println("Completion continue.........");
        }
    }
}
