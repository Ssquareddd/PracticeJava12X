package ex_02_java_basic_Part2;

public class Lab024_printf {
    public static void main(String[] args) {

        int a =10;
        System.out.println(a);
        //System.out.printf("Your Variable is %f",a);

        //%d -> int , byte, long, short,  - data type
        //%s -> string
        //%f -> float
        //%b -> boolean



        int b =20;
        // A format string as described in format string syntax
        System.out.printf("%d + %d", a,b);
        System.out.printf("a value is %d, b value is %d",a ,b);
        System.out.println();
        System.out.printf("Your value :%d, Your value : %d",a ,b);
        System.out.println();
        System.out.printf("a = %d , b= %d",a ,b);
        //System.out.printf("a ,b = %d",a ,b);
    }
}
