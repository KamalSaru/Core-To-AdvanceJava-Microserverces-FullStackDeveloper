package JavaClasses.Exceptions;

public class DemoArray {
    public static void main(String[] args) {
        try {

            int arr[] = {10, 20, 30, 7, 45, 78};
            arr[3] = arr[3] / 0;
        //} catch (AirthmaticException | ArrayIndexOutOfBoundsException ae){
        } catch (Exception e){

        }
    }
}
