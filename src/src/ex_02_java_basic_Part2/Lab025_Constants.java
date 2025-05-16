package ex_02_java_basic_Part2;

public class Lab025_Constants {
    public static void main(String[] args){

        int a =10;
        System.out.println(a);

        final int b = 10;
        //b =11; -> java : cannot assign a value to final variable b
        System.out.println(b+1);
        System.out.println(b+25);
        System.out.println(b+89);


        final float PI = 3.14f;
    }
}
