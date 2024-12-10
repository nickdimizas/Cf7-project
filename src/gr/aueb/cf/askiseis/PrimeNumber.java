package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("Please enter an integer 1 and higher or -1 to exit");
            num = in.nextInt();
            System.out.println("the number " + num + " is prime: " + isPrime(num));
        } while (num != -1);
    }

    public static boolean isPrime(int num) {
        int i;
        if (num <= 1) {
            return false;
        } else {
            for (i = 2; i < num; i++) {
              if (num % i == 0)
                return false;
            }
        } return true;
    }
}
