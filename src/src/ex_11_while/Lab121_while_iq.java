package ex_11_while;

import java.util.Scanner;

public class Lab121_while_iq {
    public static void main(String[] args) {


        // Factorial Program

        // The Logic building formula i am telling here
        // Step 1 - you have to figure out what data type is needed for i/p and o/p
        // Step 2 - write a rough logic around this.
        // Step 3 - write a proper logic around this
        // Step 4 - optimize
        // Step 5 - fig out the edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial calculation program");
        System.out.println("Enter the number to calculate the factorial");

        if(!scanner.hasNextInt()) {
            System.out.println("Enter the int, rerun the program");
        }

        int number = scanner.nextInt();
        int factorial = 1;

        if(number ==0){
            System.out.println("Factorial is" + factorial);

        }

        if(number > Integer.MAX_VALUE){
            System.out.println("Cant get the factorial as out of bound! (int)");
        }

        int i = 1;
        while(i <= number){
            factorial = factorial * i;
            i++;


        }
        System.out.println(factorial);

    }
}
