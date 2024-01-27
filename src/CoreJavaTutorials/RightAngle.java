package CoreJavaTutorials;

public class RightAngle {
    public static void main(String args[]) {
        // x for rows, y for columns, and row denotes the number of rows to print
        int x, y, row = 6;
        // outer loop for rows
        for (x = 1; x < row; x++) {
            // inner loop for columns
            // inner loop for columns
            for (y = 1; y <= x; y++) {
                // To prints stars
                System.out.print("* ");
            }
            // Cursor goes to the new line after printing each line.
            System.out.println();
        }
    }
}
