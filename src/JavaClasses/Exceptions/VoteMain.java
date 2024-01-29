package JavaClasses.Exceptions;

public class VoteMain {
    public static void main(String[] args) throws Exception{
        Voting vt = new Voting();
        try {
            vt.vote();
        } catch (Exception e){
            e.printStackTrace();
        }
        vt.vote();
    }
}
