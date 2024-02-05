package AssignmentsKuebikoIT;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask cigarette buyer age :- ");
        int age = scanner.nextInt();
        Exception.throwException(age);
    }

    private static void throwException(int age) {
        if (age > 18) {
            System.out.println("He/she will get cigaratte.");
        } else if (age == 18) {
            System.out.println("Show driving licence.");
        } else {
            System.out.println("You will get it.");
            throwException(age);
        }
    }
}
