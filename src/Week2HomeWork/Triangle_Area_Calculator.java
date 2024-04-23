package Week2HomeWork;

import java.util.Scanner;

/**
 *  Write a program to calculate the area of a triangle.
 */
public class Triangle_Area_Calculator {
    public static double calculateArea(double base , double hight){
        return 0.5 * base * hight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the tringle: ");
        double height = scanner.nextDouble();
        double area = calculateArea(base, height);
        System.out.println("The area of the tringle is: " + area);
        scanner.close();
    }




}
