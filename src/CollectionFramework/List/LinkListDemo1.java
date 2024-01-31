package CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkListDemo1 {
    public static void main(String[] args) {
        LinkedList<String > personName = new LinkedList<String>();
        personName.add("Kamal");
        personName.add("Maya");
        personName.add("Rina");
        personName.add("Madhu");
        personName.add("Tanisha");
        personName.add("Ram");
        System.out.println("--------------------------------------------------------");
        System.out.println(personName);

        System.out.println("----------------------------");
        for (String pr : personName){
            System.out.println(pr);
        }
        personName.add("Kamal");
        personName.add("Maya");
        personName.add("Rina");
        personName.add("Madhu");
        personName.add("Tanisha");
        personName.add("Ram");
        System.out.println("---------------------------------");
        System.out.println("Total person :- "+personName.size());
        System.out.println(personName);
        for (String pr : personName){
            System.out.println(pr);
        }

        personName.remove(2);
        personName.remove(8);
        System.out.println("---------------------------------------------");
        System.out.println("Total person after remove two :- "+personName.size());
        System.out.println(personName);

        personName.remove(9);
        System.out.println("------------------------------------------");
        System.out.println("Total person after remove one :- "+personName.size());
        System.out.println(personName);
    }
}
