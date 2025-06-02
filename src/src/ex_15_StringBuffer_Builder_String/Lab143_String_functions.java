package ex_15_StringBuffer_Builder_String;

public class Lab143_String_functions {
    public static void main(String[] args) {

        String name = "Sharik";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10)); // java.lang.StringIndexOutofBoundsException : Index 10 ou

        // 2. COncat
        System.out.println(name.concat("sayyad"));

        //3. contains()
        System.out.println(name.contains("arif"));

        //4. equals()
        System.out.println(name.equals("Sharik"));

        //5. equalIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sharik"));

        // 6. indexof() // sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the first
        // occurance of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace()
        System.out.println(name.length());

        //10. substring(,)
        System.out.println(name.substring(1,3));

        // 11. tolowercase()
        System.out.println("Sharik".toLowerCase());

        // 12. toUppercase()
        System.out.println(name.toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Abbas Irshad      ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Sharik"));

        StringBuilder   stringBuilder = new StringBuilder("Sharik");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Asifa");
        System.out.println(sb.toString());

        String anotherPalindrome =  "Niagara. O roar again";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        String s11 = "SharikSayyad";
        String s21 = s11.concat("Arif");
        System.out.println(s21);
    }
}
