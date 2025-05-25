package ex_09_Switch_statement;

public class Lab094_JDK13Above {
    public static void main(String[] args) {


        // in JDK>13
//        one liner switch statement

        int itemcode = 001;
        switch (itemcode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("005");
        }
    }
}
