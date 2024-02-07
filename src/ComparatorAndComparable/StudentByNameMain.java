package ComparatorAndComparable;

import StringMethod.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentByNameMain {
    public static void main(String args[]) {
        ArrayList<StudentByName> al = new ArrayList<StudentByName>();

        al.add(new StudentByName(101,"Vijay",23));
        al.add(new StudentByName(106,"Ajay",27));
        al.add(new StudentByName(105,"Jai",21));

        System.out.println("Sorting by Name");

        Collections.sort(al, new StudentByName.NameComperator());
        for(StudentByName st: al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}
