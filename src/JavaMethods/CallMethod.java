package JavaMethods;


//myMethod() is the name of the method
//static means that the method belongs to the Main class and not an object of the Main class
//void means that this method does not have a return value.
public class CallMethod {
    static void myMethod() {
        System.out.println("I love Nepal.");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
