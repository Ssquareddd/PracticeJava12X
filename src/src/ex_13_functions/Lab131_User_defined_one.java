package ex_13_functions;

public class Lab131_User_defined_one {
    public static void main(String[] args) {

        int r1 = sum_of_two_number(4,5);
        int r2 = sum_of_two_number(6,12);
        System.out.println(r1);
        System.out.println(r2);
    }
    static int sum_of_two_number(int a, int b) {
        return a + b;
    }
}
