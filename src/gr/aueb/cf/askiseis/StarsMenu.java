package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class StarsMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int stars = 0;

        do {
            printMenu();
            choice = scanner.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Please enter a valid option(1-6)");
                continue;
            }
            if (choice != 6) {
                System.out.println("Please enter number of stars");
                stars = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    printStarsHorizontally(stars);
                    break;
                case 2:
                    printStarsVertically(stars);
                    break;
                case 3:
                    printStarsNxN(stars);
                    break;
                case 4:
                    printStarsInclining(stars);
                    break;
                case 5:
                    printStarsDeclining(stars);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Not valid choice");
            }

        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1.Print n stars horizontally");
        System.out.println("2.Print n stars vertically");
        System.out.println("3.Print n stars in n rows");
        System.out.println("4.Print n stars inclining");
        System.out.println("5.Print n stars declining");
        System.out.println("6.Exit");
    }

    public static void printStarsHorizontally(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsVertically(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsNxN(int stars) {
        for (int i = 1; i <= stars; i++){
            for (int j = 1; j <= stars; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void printStarsInclining(int stars) {
        for (int i = stars; i >= 1; i--){
            for (int j = stars; j >= i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void printStarsDeclining(int stars) {
        for (int i = 1; i <= stars; i++){
            for (int j = i; j <= stars; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <=6;
    }
}
