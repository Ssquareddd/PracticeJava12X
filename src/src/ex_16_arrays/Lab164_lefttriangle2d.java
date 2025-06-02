package ex_16_arrays;

import java.util.Scanner;

public class Lab164_lefttriangle2d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Side ");
        int side = scanner.nextInt();

        for(int i = side; i>=1; i--){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
