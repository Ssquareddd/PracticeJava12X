package ex_26_generics;

public class Lab225_generics {
    public static void main(String[] args) {
        temp(23,45);
        temp("sharik", "sayyad");
        temp(3.14, 7.86);
    }

    static <T> T temp (T a, T b){
        System.out.println(a+ " " +b);
        return null;
    }

    static <T> T temp_sum(T a, T b){
        return null;
    }
}
