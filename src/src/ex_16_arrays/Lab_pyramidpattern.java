package ex_16_arrays;

import java.util.Scanner;

public class Lab_pyramidpattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Floor for pyramid:");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
