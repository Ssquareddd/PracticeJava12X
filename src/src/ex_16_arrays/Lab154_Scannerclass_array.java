package ex_16_arrays;

import java.util.Scanner;

public class Lab154_Scannerclass_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int");
        int neww = scanner.nextInt();

        String number_marks[] = new String[neww];

        for(int i = 0; i < number_marks.length; i++){
            System.out.println("Enter the marks of " + i);
            number_marks[i] = scanner.next();
        }

        System.out.println(" ------ Print the Values -------");

        for(String marks : number_marks){
            System.out.println(marks);
        }

        scanner.close();

    }
}
