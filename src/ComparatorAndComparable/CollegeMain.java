package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class CollegeMain {
    public static void main(String[] args) {
        ArrayList<College> clg = new ArrayList<College>();
        clg.add(new College(1998, "ABC University", 1200));
        clg.add(new College(1997, "xyz University", 1290));
        clg.add(new College(1999, "syd University", 12400));
        clg.add(new College(1996, "hyg University", 11200));


        // 1998 , 1997 , 1999 , 1996
        System.out.println("Before Sorting =:");
        System.out.println(" ");
        for (College cl : clg) {
            System.out.println(cl.year + " " + cl.name + " " + cl.student);
        }

        System.out.println(" ");
        System.out.println("After Sorting on the basis of Year=:");
        System.out.println(" ");
        Collections.sort(clg, new College.YearComparator()); //Need change
        for (College cl : clg) {
            System.out.println(cl.year + " " + cl.name + " " + cl.student);
        }
    }
}
