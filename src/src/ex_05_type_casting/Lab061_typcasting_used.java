package ex_05_type_casting;

public class Lab061_typcasting_used {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
        int total = course + (int)GST;
        System.out.println("Total is " + total);


        float total1 = course + GST;
        float total2 = course - GST;
        System.out.println("Total is " + total1);
    }
}
