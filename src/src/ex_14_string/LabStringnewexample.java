package ex_14_string;

public class LabStringnewexample {
    public static void main(String[] args) {


        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Sharik".substring(1,3);
        System.out.println(s1);

        char[ ] arr = "Programming".toCharArray();
        System.out.println(arr); // ['P' , 'r' , 'o', 'g']

        String st = " Sayyad ".trim();  // it will remove the space presnet in string
        st = "Sayyad";
        System.out.println(st);


        boolean b = "     ".isBlank();
        System.out.println(b);

        String s2 = "ss".repeat(3);
        System.out.println(s2);

        boolean b11 = "JAVA".equalsIgnoreCase("java");
        System.out.println(b11);

        String s111 = String.format("%s = %d", "age", 25);
        System.out.println(s111);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
