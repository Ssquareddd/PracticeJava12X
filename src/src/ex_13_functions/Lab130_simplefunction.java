package ex_13_functions;

public class Lab130_simplefunction {
    public static void main(String[] args) {


        // = no return type or void does not return any
        non_return_type_func();

        String a = return_type_func();
        System.out.println(a);

    }

    // Known return type function does not return anything, only printing
    static void non_return_type_func() {
        System.out.println("hi, non reurn type");
    }

    // return type function, it will return a particular data type.
    static String return_type_func() {
        System.out.println("hi, return type");
        return "sharik";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float(){
        return 1.35f;
    }

    static byte return_byte(){
        return 127;
    }

    static long return_long(){
        return 101;
    }
}
