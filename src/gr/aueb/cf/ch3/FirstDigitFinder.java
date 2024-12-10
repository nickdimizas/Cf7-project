package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * vriskei to prwto psifio aristera psifio enos akeraiou.
 */
public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Please enter a positive number");
        inputNum = scanner.nextInt();

        tempNum = inputNum;

        while (inputNum >= 10) {
            tempNum /= 10; // tempNum = tempNum / 10;
        }

        System.out.println("The first digit of " + inputNum + " is: " + tempNum);
    }
}
