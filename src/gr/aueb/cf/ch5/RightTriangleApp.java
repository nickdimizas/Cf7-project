package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * checks if a triangle is right.
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        final double EPSILON = 0.00005;

        System.out.println("Please enter b, c, a");
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        a = scanner.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("triangle is right");
        } else  {
            System.out.println("triangle i not right");
        }
    }
}
