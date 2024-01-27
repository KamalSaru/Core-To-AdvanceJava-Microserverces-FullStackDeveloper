package CoreJava;

import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Condition
        //if username>>welcome to homepage.
        //else>>error incorrect username or password
        System.out.print("Username :- ");
        String username=scanner.next();

        System.out.print("Pin: ");
        int pin = scanner.nextInt();

        if (username.equals("Kamal")&& pin==1234){
            System.out.println("Welcome To Homepage!!!!");
            System.out.println("<<<<<<<Namaskar>>>>>>>>>");
        } else if(username.equals("Tanuja")&& pin==2345){
            System.out.println("Welcome to Homepage!!!!");
        } else {
            System.out.println("Invalid Credentials.");
            System.out.println("Please enter correct information.");
        }
    }
}
