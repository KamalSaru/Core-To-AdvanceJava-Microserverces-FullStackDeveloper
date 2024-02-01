package CollectionFramework.Set;

import java.net.Socket;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //It doesn't take duplicate value--------
        //It take the value null
        //It does not maintain the insertion orders
        HashSet<String> set= new HashSet<String>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Grapes");
        set.add("Orange");
        set.add("Guava");
        set.add(null);

        System.out.println("--------------------------------------");
        System.out.println("Total number of items :- " + set.size());

        for (String items : set){
            System.out.println(items);
        }

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Grapes");
        set.add("Orange");
        set.add("Guava");
        System.out.println("-----------------------------------------");
        System.out.println("After adding duplicate fruits items");
        System.out.println("Total fruits items :- " + set.size());
        System.out.println("It take the null value.");
        System.out.println("It doesn't take duplicate value.");
        System.out.println("It does not maintain the insertion orders.");
        System.out.println(" ");

        for (String items : set){
            System.out.println(items);
        }
    }
}
