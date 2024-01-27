package CoreJava;

public class Pyramid {
    public static void main(String[] args) {
        int x,y,row=5;
        for (x=0; x<row; x++){
            for (y=row-x; y>1; y--){
                System.out.println(" ");
            }
            for (y=0; y<=x; y++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
