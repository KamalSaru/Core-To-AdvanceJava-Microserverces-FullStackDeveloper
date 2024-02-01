package CollectionFramework.List;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        //Generic arraylist only one data types---------
        //Access and manipulate the value
        //Take duplicate value----
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(15);

        System.out.println("Size of Array list :- "+list.size());

        System.out.println("Elements of the list are :- "+list);
        System.out.println("After Iterating :- ");
        for (Integer element : list){
            System.out.println(element);
        }

        //Arraylist accept duplicate value
        //Duplicate value add the element size
        //It will make list all the duplicate value
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(15);

        System.out.println("Size after duplicate value :- "+list.size());
        System.out.println("Total elements after duplicate :- "+list);
        //Clone--mix in same array list
        System.out.println(list.clone());

    }
}
