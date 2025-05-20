package ex_05_type_casting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9821310282l;
       // short s = phone_no;
        short s = (short)phone_no;
        System.out.println(s);
    }
}
