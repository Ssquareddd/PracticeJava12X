package ex_15_StringBuffer_Builder_String;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        stringBuffer.append("!");
        System.out.println(stringBuffer);

        String s1 = "Sharik";
        s1 = s1 + "Sayyad";
        System.out.println(s1);
    }
}
