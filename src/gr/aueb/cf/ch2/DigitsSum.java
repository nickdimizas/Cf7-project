package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * na lamvanei os input apo ton xrhsth ena
 * dipsifio akeraio kai na upologizei
 * kai na ektuponei to athroisma ton psifion tou
 * Gia paradeigma an o xrhsths dosei ton akeraio 15 tha prepei to apotelesma
 * na einai 1 +5 = 6.
 */
public class DigitsSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Please insert a two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; // me div 10 pernoume to aristero psifio
        rightDigit = inputNum % 10; // me mod 10 pernoume to deksi psifio
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d",
                inputNum, leftDigit, rightDigit, sum);

    }
}
