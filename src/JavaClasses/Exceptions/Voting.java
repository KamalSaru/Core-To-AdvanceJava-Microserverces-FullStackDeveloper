package JavaClasses.Exceptions;

import java.util.Scanner;

public class Voting {
    public void  vote() throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Age :- ");
        int age=scanner.nextInt();

        if (age>=18){
            System.out.println("You can vote.");
        } else {
            throw new Exception("You are under age.");
        }
    }
}
