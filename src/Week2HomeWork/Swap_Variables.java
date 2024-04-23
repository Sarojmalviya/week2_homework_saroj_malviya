package Week2HomeWork;

/**
 * Write a Java program to swap two variables.
 */
public class Swap_Variables
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping:");
        System.out.println("a = " + a + "b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
