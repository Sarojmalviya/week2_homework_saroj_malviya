package Week2HomeWork;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Instance_Variable_Method {
    //Instance variables
         int a1;
         int a2;
    //Instance method
    public void printNumbers(){
        System.out.println("Fisrt number:" + a1);
        System.out.println("Second number: " +a2);
    }
    //Main method
    public static void main(String[] args) {
           Instance_Variable_Method obj1 = new Instance_Variable_Method();
           obj1.a1 = 10;
           obj1.a2 = 20;

    //call instance method
           obj1.printNumbers();

    }
}
