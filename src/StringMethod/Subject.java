package String;

public class Subject {
    public static void main(String[] args) {
        String language="Java";
        String description =" is the best programing language.";
        String language1="Python";

        String str = "bat ball";

        //concat ---concat add two string value
        String lng = language.concat(description);
        System.out.println(lng);

        String lng1=language1.concat(description);
        System.out.println(" ");
        System.out.println(lng1);

        //length: It returns the length of the string
        System.out.println("  ");
        System.out.println("length = "+language.length());
        System.out.println("length = "+ description.length());

        //toUppercase()---It will make String in Uppercase
        System.out.println("Uppercase = "+language.toUpperCase());

        //toLowercase()---It will make String in Lowercase
        System.out.println("Lower : " + language.toLowerCase());

        //compareTo()--It compare String in terms of alphabet order
        System.out.println("Compare to = "+language.compareTo(language1));

        //replace()--It will replace the matching character from the string
        System.out.println("Replace = " +str.replace('b', 'c'));

        //substring()--It will make a Substring according to your condition
        System.out.println("Substring = "+description.substring(0, 7));

        //contains ---Ti check the String weather that string contains that character level

    }
}
