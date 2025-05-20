package ex_05_type_casting;

public class Lab059_Typecasting_narrowing {
    public static void main(String[] args) {

        int val = 300;
        //byte b1 = val; Narrowing - Implicit JVM to do  it. - Data Loss will happen
        byte b = (byte) val;  // Narrowing - Explicit JVM to do i. - Data Loss will happen

        System.out.println(b);
    }
}
