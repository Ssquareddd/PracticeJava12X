package ex_09_Switch_statement;

import java.util.Scanner;

public class Lab085_Switchcase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num between 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println("Invalid day");




            }

        }else{
            System.out.println("You should enter a number between 1 to 7, which should be only a int value");
        }



    }
}
