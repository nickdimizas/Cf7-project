package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean iSLeapYear = false;

        System.out.println("Please insert a year.");
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            iSLeapYear = true;

        System.out.println("The year " + year + " is a Leap Year: " + iSLeapYear);
    }
}
