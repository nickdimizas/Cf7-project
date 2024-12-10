package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class StarsVertical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please enter a number for stars");
        stars = scanner.nextInt();

        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }
}
