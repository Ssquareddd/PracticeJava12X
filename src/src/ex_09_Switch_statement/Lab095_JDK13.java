package ex_09_Switch_statement;

public class Lab095_JDK13 {
    public static void main(String[] args) {

        // JDK > 13

        int itemcode = 006;
        switch (itemcode) {
            case 001,002,003:
                System.out.println("All of them are Electronic Gadget");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");

        }
    }
}
