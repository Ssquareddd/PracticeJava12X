package ex_09_Switch_statement;

import java.util.Scanner;

public class Lab084_Swithc {
    public static void main(String[] args) {


        // You need to take a user input and ask for the
        // integer from 1 to 7 and if user
        // enters 1 to 7 you will
        // tell which day it is
        /*       Logic Building Formula          */
        // Step 1 - number one is using the Scanner Class
        // Step 2- will be basically figuring out the expression and the day.
        // Step 3 - We will basically add step 3 as a rough logic
        // Step 4 - is you will write the fix the logic and optimize
        // Step 5- Fig out the Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num between 1 to 7");
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


    }
}
