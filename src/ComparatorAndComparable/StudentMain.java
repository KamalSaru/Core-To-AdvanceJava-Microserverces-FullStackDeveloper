package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<Students>();
        studentList.add(new Students(107, "Kamal", 25));
        studentList.add(new Students(102, "Shankar", 35));
        studentList.add(new Students(109, "Ram", 27));
        studentList.add(new Students(101, "Maya", 37));
        studentList.add(new Students(104, "Gita", 45));
        studentList.add(new Students(106, "Hari", 31));
        Collections.sort(studentList); //Collections
        for (Students st : studentList){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Roll Number :- "+st.rollNumber+ "   Student Name :- "+st.name +"   Student Age :- "+ st.age);
        }
    }
}
