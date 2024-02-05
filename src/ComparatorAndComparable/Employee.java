package ComparatorAndComparable;

public class Employee implements Comparable<Employee> {
    int age;
    String name;
    double salary;

    public  Employee(int age, String name, double salary){
        super();
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee emp){
        if (age ==emp.age)  //Sorting using the age and sort in ascending order
            return 0;
        else if (age>emp.age) //Sorting ascending order of age
            return 1;
        else
            return -1;
    }
}
