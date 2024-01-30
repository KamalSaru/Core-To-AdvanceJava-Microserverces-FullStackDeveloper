package CollectionFramework.List;
import java.util.ArrayList;


public class NonGenericArrayList {
    public static void main(String[] args) {
        //No generic arraylist mix of data types--------
        ArrayList list =new ArrayList();
        list.add(14);
        list.add("Kamal");
        list.add('A');
        list.add(true);
        list.add(79.42);
        list.add(443449123);

        System.out.println("Size of the array list :- "+list.size());
        System.out.println("Elements of the array list :- "+list);
        System.out.println(list.clone());

        System.out.println("After iterating-----------");
    }
}
