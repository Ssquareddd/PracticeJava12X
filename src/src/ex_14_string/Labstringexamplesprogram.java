package ex_14_string;

public class Labstringexamplesprogram {
    public static void main(String[] args) {


        String s= "sarik";
        char c = s.charAt(2);
        // Index = 0, ->
        System.out.println(c);

        System.out.println(s.codePointAt(0));

        //compare to ignore(strinf sr)

//        int result = "abc".compareTo("ABC");
//        int result2 = "abc".compareToIgnoreCase("ABC");
//        System.out.println(result);
//        System.out.println(result2);


        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("p-", "Java", "automation");
        System.out.println(s11);

        String s12 = "java".replace('v', 's');
        System.out.println(s12);

        boolean b12 = "Java".startsWith("ja");
        System.out.println(b12);














    }
}
