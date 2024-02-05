package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(26, "Kamal", 110000));
        empList.add(new Employee(27, "Shankar", 150000));
        empList.add(new Employee(23, "Ram", 95000));
        empList.add(new Employee(31, "Maya", 130000));
        empList.add(new Employee(35, "Gita", 120000));
        empList.add(new Employee(33, "Hari", 120000));
        Collections.sort(empList);

        for (Employee emp : empList) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Employee Age :- "+emp.age + "   Employee Name :- " + emp.name + "   Employee Salary:- " + emp.salary);
        }
    }
}
