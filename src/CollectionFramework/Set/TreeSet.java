package CollectionFramework.Set;

import java.net.Socket;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        //It should not accept duplicate values.
        //It does not take null value

        Set<String> fruits =new java.util.TreeSet<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("Kiwi");
        //fruits.add(null);

        System.out.println("Size of the fruits list :- "+fruits.size());
        for (String ft : fruits){
            System.out.println(ft);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Size of the fruits list after adding :- "+fruits.size());
        System.out.println("Total fruits items :- " + fruits.size());
        System.out.println("It doesn't take the null value.");
        System.out.println("It doesn't take duplicate value.");
        System.out.println("It does not maintain the insertion orders.");
        System.out.println(" ");

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("Kiwi");
        //fruits.add(null);
        for (String ft : fruits){
            System.out.println(ft);
        }
    }
}
