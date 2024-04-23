package Week2HomeWork;

/**
 * Write a Java program to print the area and perimeter of a rectangle. Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Rectangle
{
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 *(width + height);
        System.out.println("area is  " + width + " * " + height + " = " + area );
        System.out.println("perimeter is 2 * (" + width +" + " + height + ") = " + perimeter);
    }
}
