package CollectionFramework.List;

import java.util.ArrayList;

public class GenericArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Toyota");
        for (int i=0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
