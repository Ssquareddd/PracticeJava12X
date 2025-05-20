package ex_06_ternery_operator;

public class Lab066_To_even_odd {
    public static void main(String[] args) {

        //Step 1 -> Input, Output - data type
        int num = -13;

        //input -> int
        //Output  -> String -> even or odd

        //Step 2 ->
        // num%2 == 0> even else 1 odd
        String result = (num%2 == 0) ? "even" : "odd";
        System.out.println(result);

        // Edge Cases
        // - negative, float, o
    }
}
