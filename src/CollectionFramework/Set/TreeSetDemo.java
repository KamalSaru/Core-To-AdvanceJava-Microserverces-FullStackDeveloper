package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //It is sorted in ascending order------------------

        Set<Integer> num = new TreeSet<Integer>();
        num.add(10);
        num.add(6);
        num.add(19);
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(11);
        num.add(9); // doesn't take duplicate value
        //num.add(null);

        System.out.println("Total number of list are :-" +num.size());
        System.out.println("Number are printing in ascending order.");
        System.out.println("It doesn't take the null value.");
        System.out.println("It doesn't take duplicate value.");
        System.out.println("It maintain the insertion orders.");
        System.out.println(" ");
        for (Integer value : num){
            System.out.println(value);
        }
    }
}
