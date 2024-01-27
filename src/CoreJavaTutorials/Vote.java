package CoreJavaTutorials;

import java.util.Scanner;



//If/else conditions-----
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age for vote :- ");
        int age = sc.nextInt(); // age = 17
        // Condition
        // age>=18 :- Vote
        // Do not Vote
        if (age >= 18) {
            System.out.println("Able to vote.");
        } else {
            System.out.println("You can not Vote.");
        }
    }
}
