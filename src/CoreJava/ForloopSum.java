package CoreJava;

import java.util.Scanner;

public class ForloopSum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number until sum :- ");
        int num =scanner.nextInt();

        int sum=0;
        for (int i=1; i<=num; i++){
            sum += i;
            //sum=sum + i;
        }
        System.out.println("Total sum :- "+sum);
    }
}
