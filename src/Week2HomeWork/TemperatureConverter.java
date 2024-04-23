package Week2HomeWork;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius
 * ((F − 32) × 5/9 = 0°C).
 */

public class TemperatureConverter {
    public static double fuhrenheiToCelsius(double fahrenheit){
        return (fahrenheit -32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = fuhrenheiToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius + "°C");
        scanner.close();

    }
}
