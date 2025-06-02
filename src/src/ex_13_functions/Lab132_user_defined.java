package ex_13_functions;

import java.util.Scanner;

public class Lab132_user_defined {
    public static void main(String[] args) {


        // User Defined Function

        //1. Without parameters and without return type
        //2. Without parameters and with return type
        // 3. Without Parameter and Without return type
        // 4. With Parameters and with return type

        // 1. Without Argument and without return type
        wp_wr_greet();

        // 2. Without parameters and with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3. With Parameters but without return type
        greet_with_details("pramod", 65,100);
        greet_with_details("Ankit", 100, 120);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        greet_with_details(name,age,salary);

        // 4. With Parameters and with return type
        int sum = sum_of_three_number(4,5);
        int sum2 = sum_of_three_number(190, 900);
        int sum3 = sum_of_three_number(2435,5432);
        int sum4 = sum_of_three_number(2345,5432,5432);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);


    }

    //1. Without parameters and withour return type
    static void wp_wr_greet() {
        System.out.println("Hello, World!");
    }

    //2. Without parametrs and with return type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("hi");
        return "Hello, World!";
    }
    //3. With parameters and without return type
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("your name is" +name + "\n your age is" +age+ "\n your salary is" +salary);
    }

    // 4. With Parameters and With return type

    static int sum_of_three_number(int a, int b) {
        return a+b;
    }

    static int sum_of_three_number(int a, int b, int c) {
        return a+b+c;
    }

    static float sum_of_three_number(float a, float b, float c) {
        return a+b+c;
    }
}
