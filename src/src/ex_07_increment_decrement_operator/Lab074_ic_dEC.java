package ex_07_increment_decrement_operator;

public class Lab074_ic_dEC {
    public static void main(String[] args) {


        int a = 10;
        System.out.println(a++ + a);

        // A+B
        // A -> a++ -> ExpA -> 10 , a -> 11
        // +
        // B -> a -> ExpB -> 11

        // ERT
        // LNo |  a | Exp
        // 5   | 10  | NA
        // 6   | -  | 10+11 ->  21
    }
}
