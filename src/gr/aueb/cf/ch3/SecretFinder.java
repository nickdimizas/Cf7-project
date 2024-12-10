package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * uparxei enas Secret pou einai integer
 * kai o user me mia mono prospatheia tha prospathisei
 * na ton vrei
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Instert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!");
        } else { // num != SECRET
            System.out.println("Failure!!");
        }
    }
}
