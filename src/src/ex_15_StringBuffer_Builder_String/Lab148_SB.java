package ex_15_StringBuffer_Builder_String;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("Java Automation");
        bf.append("with Selenium");
        System.out.println(bf);

        bf.delete(12,15);
        System.out.println(bf);

        bf.replace(0,4,"python");
        System.out.println(bf);

    }
}
