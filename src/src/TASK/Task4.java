package TASK;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Factorial Program Hacker rank
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for which you want the factorial!");
        int n = scanner.nextInt();
        int fact = 1;
        if(n == 0){
            fact = 1;
        }
        for ( int i = 1;i <= n; i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
