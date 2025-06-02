package ex_16_arrays;

import java.util.Scanner;

public class Lab163_2D_rightTriangle {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = scan.nextInt();

        for(int i = 0; i < side; i++){
            for(int j =0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
