package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class FindMaxOfThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum1;
        int inputNum2;
        int inputNum3;

        System.out.println("Please insert three integers");
        inputNum1 = in.nextInt();
        inputNum2 = in.nextInt();
        inputNum3 = in.nextInt();
        System.out.printf("MAX of %d, %d, %d = %d", inputNum1, inputNum2, inputNum3, maxNumber(inputNum1,inputNum2,inputNum3));
    }

    public static int maxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
