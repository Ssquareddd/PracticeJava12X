package ex_09_Switch_statement;

import java.util.Scanner;

public class Lab088_Real_switch_automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "firefox":
                System.out.println("Firefox");
                System.out.println("Firefox");
                System.out.println("Firefox");
                System.out.println("Firefox");
                break;
            case "chrome":
                System.out.println("Chrome");
                System.out.println("Chrome");
                break;
            case "safari":
                System.out.println("Safari");
                System.out.println("Safari");
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }
    }
}
