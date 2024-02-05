package AssignmentsKuebikoIT;

public class Exception1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try
        {
            int arr[] = new int[5];
            arr[3] = arr[3]/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception caught!!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught!!");
        }
        catch(java.lang.Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Compilation Continues...");

    }
}
