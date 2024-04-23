package Week2HomeWork;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
   public class Static_Variable_Method
{
    //Declare two Static Variable
        static int a1 = 10;
        static int a2 = 20;

    //Declare one static method
         static void printstaticvariable(){
             System.out.println("static variable 1:  " +a1);
             System.out.println("static variable 2:  " +a2);
         }

     //Declare the main method
     public static void main(String[] args) {

     //call the static method into the main method
      printstaticvariable();
     }
}
