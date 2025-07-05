package ex_23_Wrapper_class;

public class Lab205_Wrpper {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // Boxing - int -> Autoboxing - JVM will do it

        System.out.println(a);
        System.out.println(b.intValue());


        //UnBoxing
        Integer aa = 43;
        int a1 = aa; // UNBOXING
        System.out.println(a1);
        System.out.println();

        // Intger a11 = new Integer(10);
        Integer a11 = 10;

        // Arraylist<Integer> numbers = new Arraylist<>();
        //numbers.add(100);

        Integer myint = 10;
        String stringValue = myint.toString();
        int p_int = myint.intValue();
        int p_int2 = myint;
    }
}
