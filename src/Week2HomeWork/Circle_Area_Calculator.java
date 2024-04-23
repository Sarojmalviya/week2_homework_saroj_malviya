package Week2HomeWork;

import java.util.Scanner;

/**
 *  Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).
 */
public class Circle_Area_Calculator
   {
    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the radius of the circle: ");
           double radius = scanner.nextDouble();
           double area = calculateArea(radius);
           System.out.println("The area of the circle with radius " + radius + "is:" +area);
           scanner.close();
       }

}
