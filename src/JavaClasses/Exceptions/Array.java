package JavaClasses.Exceptions;

public class Array {
    public static void main(String[] args) {

        try {

        int arr[] ={10,20,30,7,45,78};
        arr[3] =arr[3]/0;
        //} catch (AirthmaticException e){
            System.out.println("Airthmatic exception cought");
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index out of bound exception cough");
        }
        System.out.println("Compilation continues........");
    }
}
