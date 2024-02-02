package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        List<Integer>arraNumberList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the total number of array list:- ");
        int arraylist =scanner.nextInt();

        for (int i=0; i<arraylist; i++){
            System.out.println("Enter array numbers :- ");
            int number = scanner.nextInt();
            arraNumberList.add(number);
        }
        int largestNumber = arraNumberList.stream().max(Integer::compare).get();
        System.out.println("Largest number is :- "+largestNumber);
    }
}
