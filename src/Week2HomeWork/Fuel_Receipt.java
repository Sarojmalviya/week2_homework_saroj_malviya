package Week2HomeWork;

/**
 * "+------------------------+"
 * "| |"
 * "| CORNER STORE |"
 * "| |"
 * "| 2015-03-29 04:38PM |"
 * "| |"
 * "| Gallons: 10.870 |"
 * "| Price/gallon: $ 2.089 |"
 * "| |"
 * "| Fuel total: $ 22.71 |"
 * "| |"
 * "+------------------------+"
 */
public class Fuel_Receipt {
    public static void main(String[] args) {
        double a = 10.870;
        double b = 2.089;
        double result = a * b;
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      CORNER STORE      |");
        System.out.println("|                        |");
        System.out.println("| 2015-03-29 04:38PM     |");
        System.out.println("|                        |");
        System.out.println("| Gallons:        " + a +"  |");
        System.out.println("| Price/gallon:    $"+ b +"|");
        System.out.println("|                        |");
        System.out.println("| Fuel total:  $"+result+" |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");

    }
}
