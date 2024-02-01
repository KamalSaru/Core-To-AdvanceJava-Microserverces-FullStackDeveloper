package CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        //It should not accept duplicate values.
        //It should maintain the insertion order
        //It accept the null values.

        Set<String> fruits =new LinkedHashSet<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add(null);

        System.out.println("--------------Fruits items list---------------");
        System.out.println("Total size of fruits items :- "+fruits.size());
        for (String ft : fruits){
            System.out.println(ft);
        }

        System.out.println("--------------------------------------------");
        System.out.println("After adding the fruits items :- "+fruits.size());
        System.out.println("Total fruits items :- " + fruits.size());
        System.out.println("It take the null value.");
        System.out.println("It doesn't take duplicate value.");
        System.out.println("It does not maintain the insertion orders.");
        System.out.println("   ");

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Guava");
        for (String ft : fruits){
            System.out.println("Fruits item list :- " + ft);
        }
    }
}
