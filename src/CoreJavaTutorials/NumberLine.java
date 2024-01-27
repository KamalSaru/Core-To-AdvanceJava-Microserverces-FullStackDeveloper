package CoreJavaTutorials;

import java.util.Scanner;

public class NumberLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number for check :- ");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("Positive number.");
        } else if (number<0){
            System.out.println("Negative number.");
        } else {
            System.out.println("Zero");
        }
    }
}
