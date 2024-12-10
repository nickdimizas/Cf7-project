package gr.aueb.cf.ch1;

import java.util.Scanner;

public class FahrenToCelsiusWithDouble {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputFahrenheit = 0;
        double celsius = 0;

        System.out.println("Please insert a temperature in Fahrenheit");
        inputFahrenheit = in.nextDouble();
        celsius = 5 * (inputFahrenheit - 32) / 9;
        System.out.printf("%,2f Fahrenheit = %,2f Celsius\n", inputFahrenheit, celsius);
    }
}
