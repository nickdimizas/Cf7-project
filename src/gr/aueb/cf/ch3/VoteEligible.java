package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * dikaioma psifou se ilikies > 18.
 * elegxei an mia ilikia exei dikaioma na psifisei.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean isEligible = false;
        final int VOTING_AGE = 18;

        System.out.println("Please insert your age");
        age = scanner.nextInt();

         isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " + isEligible);
    }
}
