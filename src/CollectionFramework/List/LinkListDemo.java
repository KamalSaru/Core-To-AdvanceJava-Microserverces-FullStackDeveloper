package CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("----------------------------------------------------------");
        System.out.println(list);

        System.out.println("--------------------------");
        for (Integer vl : list){
            System.out.println(vl);
        }

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("----------------------------------");
        System.out.println("Size of linklist :- "+list.size());
        System.out.println(list);
        for (Integer vl : list){
            System.out.println(vl);
        }

        list.remove(2);//Remove-3 in position 2(0-1, 1-2, 2-3)
        list.remove(5);//Remove-1 in position 5
        System.out.println("-----------------------------");
        System.out.println("Size of Arraylist after remove two index :- "+list.size());
        System.out.println(list);

        list.remove(9); //Remove 6 in position 9
        System.out.println("-----------------------------");
        System.out.println("Size of Arraylist after remove one index :- "+list.size());
        System.out.println(list);
    }
}
