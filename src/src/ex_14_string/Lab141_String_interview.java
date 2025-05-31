package ex_14_string;

public class Lab141_String_interview {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");


        // == -> Comparison -> String => this check the ref location

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s5);

        System.out.println(s1 == s2);
        System.out.println(s3 == s5);

        // equals(content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        // equalsIgnoreCae -> sharik, Sharik, SHARIK, SHArik, ShaRik -> sharik
        // == - check for the ref
        // = assignment the value


    }
}
