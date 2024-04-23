package Week2HomeWork;

/**
 *3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class One_Instance_One_Static_Variable_Method
{
    //Declare one instance and one static varivable
         int x1 = 2;
         static int y1 = 4;

    //  Declare one instance method
       void m1(){
           System.out.println("Instance variable: "  + x1);
           System.out.println("static variable: "  +y1);
       }
    //Declare one static method
        static void s1(){
            One_Instance_One_Static_Variable_Method o1 = new One_Instance_One_Static_Variable_Method();
            System.out.println("Instance variable: "  + o1.x1);
            System.out.println("Static variable: "  + y1);
        }

    // Declare main method
    public static void main(String[] args) {

     //call both instance and static method into the main method
        One_Instance_One_Static_Variable_Method o1 = new One_Instance_One_Static_Variable_Method();
        o1.m1();
        s1();
    }
}
