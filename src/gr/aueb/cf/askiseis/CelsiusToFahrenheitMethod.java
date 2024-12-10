package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class CelsiusToFahrenheitMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputCelsius = 0.0;

        System.out.println("Please enter temp in Celsius");
        inputCelsius = in.nextDouble();
        System.out.printf("%.2f celsius = %.2f fahrenheit", inputCelsius, tempInFahrenheit(inputCelsius));
    }

    public static double tempInFahrenheit(double temp) {
        double fahrenheit = 0.0;

        fahrenheit = temp * 9 / 5 + 32;
        return fahrenheit;
    }
}
