package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * upologizei to athroisma ton artion apo to 2
 * mexri ena orio pou dinei o user.
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }

        System.out.println("The sum of even numbers up to " + inputNum + " is: " + sum);
    }
}
