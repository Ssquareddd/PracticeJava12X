package ex_15_StringBuffer_Builder_String;

public class Lab144_StringBuilder_vs_Buffer {
    public static void main(String[] args) {

        String s0 = "Pramod";
        String s1 = new String("Sharik");

        // less than <10% used
        StringBuffer stringBuffer = new StringBuffer("Sharik");
        StringBuilder stringBuilder = new StringBuilder("Sharik");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
