package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Please choose one of the following:");
            System.out.println("1.Insertion");
            System.out.println("2.Deletion");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

        if (choice <= 0 || choice > 5) {
            System.out.println("Choice not valid!Try again!");
            continue;
        }
        if (choice == 5) {
            System.out.println("Exiting...");
            break;
        }

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
                System.out.println("Error in choice");
                break;
        }
        }
    }
}
