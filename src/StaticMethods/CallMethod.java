package StaticMethods;

public class CallMethod {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        StudentDetails st = new StudentDetails();
        System.out.println("First Name:  " +StudentDetails.firstName);
        System.out.println("Last Name : " + st.lastName);
        System.out.println("My phone Number : " +st.phone);
        st.address();
        StudentDetails.officeAddress();

    }
}
