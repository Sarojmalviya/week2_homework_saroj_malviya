package Week2HomeWork;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Add_Binary_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine();
        scanner.close();
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        String binarysum = Integer.toBinaryString(sum);
        System.out.println("sum of two binary number: " +binarysum);
    }
}
