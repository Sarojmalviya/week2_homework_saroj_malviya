package Week2HomeWork;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.  Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int decimal = scanner.nextInt();
        scanner.close();
        String binary = "";
        while (decimal > 0) {
            int reminder = decimal % 2;
            binary = reminder + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary number is: " + binary);
    }
}
