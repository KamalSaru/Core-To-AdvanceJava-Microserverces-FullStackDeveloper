package CoreJava;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //for loop ----repetitive task
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter name :- ");
        String name= scanner.next();

        System.out.print("Repeat time :- ");
        int num =scanner.nextInt();

        for (int i=1; i<=num; i++){
            System.out.println(name);
        }
    }
}
