package ex_14_string;

public class Lab142_String_functions {
    public static void main(String[] args) {

        //  String s1 = "HELLO"; // SCP
        //String s2 = new String("world");  // OA

        String str1 = "Hello";
        String str2 = "Sharik";
        String str3 = new String("Sayyad");

        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));

        System.out.println(str2.concat(str3));
    }
}
