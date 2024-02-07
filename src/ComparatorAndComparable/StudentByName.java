package ComparatorAndComparable;

import StringMethod.Student;

import java.util.Comparator;

public class StudentByName {
    int rollNo;
    String name;
    int age;
    StudentByName(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static class NameComperator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            StudentByName s1 = (StudentByName) o1;
            StudentByName s2 = (StudentByName) o2;
            return s2.name.compareTo(s1.name);
        }
    }
}
 