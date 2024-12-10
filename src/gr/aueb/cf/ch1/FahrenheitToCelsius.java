package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Conversion from Fahrenheit to Celsius.
 * The user gives Fahrenheit and the program calculates
 * and prints the Celsius degree
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputFahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert a temperature in Fahrenheit");
        inputFahrenheit = in.nextInt();
        celsius = 5 * (inputFahrenheit - 32) / 9;
        System.out.printf("%d Fahrenheit = %d Celsius\n", inputFahrenheit, celsius);
    }
}
