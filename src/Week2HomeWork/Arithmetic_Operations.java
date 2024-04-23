package Week2HomeWork;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

    }
}
