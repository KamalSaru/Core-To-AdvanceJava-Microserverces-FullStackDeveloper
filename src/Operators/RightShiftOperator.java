package Operators;

public class RightShiftOperator {
    //right shift operator >> is used to move the value of the left operand
    // to right by the number of bits specified by the right operand.
    public static void main(String[] args) {
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2
    }
}
