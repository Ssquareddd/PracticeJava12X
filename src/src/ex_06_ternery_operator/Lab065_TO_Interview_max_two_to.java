package ex_06_ternery_operator;

public class Lab065_TO_Interview_max_two_to {
    public static void main(String[] args) {

        // find the maximum number between two numbers.

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));

        int max = x>y ? x : y;
        System.out.println(max);
    }
}
