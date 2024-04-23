package Week2HomeWork;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Uppercase_To_Lowercase
{
    String uppercaseText = "GOOD MORNING";
    String lowercaseText;
    void converttolowercase(){
        lowercaseText = uppercaseText.toLowerCase();
        System.out.println("Uppercase Text: " +uppercaseText);
        System.out.println("Lowercase Text: " +lowercaseText);

    }

    public static void main(String[] args) {
        Uppercase_To_Lowercase ul1 = new Uppercase_To_Lowercase();
        ul1.converttolowercase();
    }
}
