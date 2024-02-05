package ComparatorAndComparable;

public class Students implements Comparable<Students>{
    int rollNumber;
    String name;
    int age;

    Students(int rollNumber, String name, int age){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Students st){
        if (rollNumber==st.rollNumber) //Sorting using the roll number and sort ascending in order.
            return 0;
        else if (rollNumber>st.rollNumber) //Sorting ascending order of roll number
            return 1;
        else
            return -1;
    }
}
