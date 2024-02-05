package AssignmentsKuebikoIT;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the row you want to pattern:- ");
        int rows = scanner.nextInt();

        System.out.println("Patterns");
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in each row
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
