package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class StarsInclining {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please enter a number of stars");
        stars = scanner.nextInt();

        for (int i = stars; i >= 1; i--){
            for (int j = stars; j >= i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
//        for (int i = 1; i <= numberOfStars; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
