package Week2HomeWork;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
 */
public class Average_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three number:");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int average = (a1 + b1 + c1)/3;
        System.out.println("The average of " + a1 + " , " + b1 + ", and " + c1 + " is : " + average);
    }
}
