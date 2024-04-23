package Week2HomeWork;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {
    //static method
    public static String add(double a1,double b1) {
       return a1 + " + " + b1 + " = " + (a1 + b1);
    }
    public static String subtract(double a1, double b1){
        return a1 + " - " + b1 + " = " + (a1 - b1);
    }
    //Instance method
    public String muliply(double a1,double b1){
        return a1 + " * " + b1 + " = " + (a1 * b1);
    }
    public String divide(double a1,double b1){
        return a1 + " / " + b1 + " = " + (a1 / b1);
    }
    public static void main(String[] args)
    {
        //Testing two static method
        System.out.println("Addition:" + Calculator.add(10 ,20));
        System.out.println("Subtraction:" + Calculator.subtract(10,20));

        //Testing two instance method
        Calculator calculator = new Calculator();
        System.out.println("multiplication: " + calculator.muliply(10,20));
        System.out.println("Division: " + calculator.divide(10,20));
    }
}

