package ex_26_generics;

public class Labexample {
    public static void main(String[] args) {
        temp_sum(23, 45);
        temp_sum("sharik", "sayyad");
    }

    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static String temp_sum(String a, String b){
        return a+b;
    }

    static Double temp_sum(Double a, Double b){
        return a+b;
    }

    static <T> T temp_sum(T a, T b){
        return null;
    }

    static <SAYYAD> SAYYAD temp_sum1(SAYYAD a, SAYYAD b){
        return null;
    }
}
