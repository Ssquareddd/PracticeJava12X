package ex_12DoWhile;

public class Lab125_Dowhile {
    public static void main(String[] args) {

        int a = 1;
        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;
        }
        while (a < 10);
    }
}
