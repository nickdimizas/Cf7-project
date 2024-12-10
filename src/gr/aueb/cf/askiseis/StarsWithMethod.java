package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class StarsWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please enter number of stars");
        stars = scanner.nextInt();

        printStars(stars);
    }

    public static void printStars(int stars) {
        for (int i = 1; i <= stars; i++){
            for (int j = 1; j <= stars; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
