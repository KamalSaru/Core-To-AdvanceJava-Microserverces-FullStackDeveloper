package JavaClasses.Exceptions;


//Check and Uncheck exceptions handling---------
public class Demo {
    public static void main(String[] args) {
        String val =null;
        try {
            System.out.println(val.length());
        } catch (Exception e){

        }
        System.out.println("Compilation continues.....");
    }
}
