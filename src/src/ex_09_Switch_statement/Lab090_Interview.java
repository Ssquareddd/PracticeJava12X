package ex_09_Switch_statement;

public class Lab090_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Not Match ASCII");
        }
    }
}
