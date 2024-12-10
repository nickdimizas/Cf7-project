package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class MenuAppWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }
            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void  printMenu() {
        System.out.println("Please choose one of the following:");
        System.out.println("1.Insertion");
        System.out.println("2.Deletion");
        System.out.println("3.Update");
        System.out.println("4.Search");
        System.out.println("5.Exit");
        System.out.print("Enter your choice: ");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 0  && choice <= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("You chose insertion");
                break;
            case 2:
                System.out.println("You chose deletion");
                break;
            case 3:
                System.out.println("You chose update");
                break;
            case 4:
                System.out.printf("You chose search");
                break;
            default:
                System.out.println("Exiting...");
                break;
        }
    }
}
