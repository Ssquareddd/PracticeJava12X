package ex_15_StringBuffer_Builder_String;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Automation");
        builder.append("Tester");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);


    }
}
