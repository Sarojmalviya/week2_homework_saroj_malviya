package Week2HomeWork;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Two_Instance_Two_Static_Variable_One_Method

{
    //Declare two instance and two static variable
    int a = 10;
    int b = 20;
    static int a1 = 30;
    static int  b1 = 40;

    //Declare one instance method
    void inst1(){
        System.out.println("inside instance method:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a1);
        System.out.println(b1);
    }
    //Declare one static method
    static void static1(){
        System.out.println("Inside static method: ");
        Two_Instance_Two_Static_Variable_One_Method o1 = new Two_Instance_Two_Static_Variable_One_Method();
        System.out.println(o1.a);
        System.out.println(o1.b);
        System.out.println(a1);
        System.out.println(b1);
    }
    //main method
    public static void main(String[] args) {
        Two_Instance_Two_Static_Variable_One_Method o1 = new Two_Instance_Two_Static_Variable_One_Method();
        o1.inst1();
        static1();
    }

}
