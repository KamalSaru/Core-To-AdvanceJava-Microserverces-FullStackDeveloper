package CoreJava;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int num1 =sc.nextInt();

        //Remove ln for same line enter--
        System.out.print("Enter the second number = ");
        int num2 =sc.nextInt();

        //Add formula
        int sum = num1+num2;
        System.out.println("Total sum of the number = "+sum);
    }
}
