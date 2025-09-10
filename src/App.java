import java.util.*;

/**
 *  Basic task (up to B+ level):
 *    - Ask the user for a whole number x.
 *    - Print whether x is EVEN or ODD.
 *    - If x is exactly 0, also print "ZERO" on its own line.
 *
 *  Moderate task (up to A level): 
 *    - Ask for a second whole number called total (a positive number).
 *    - Compute x divided by total as a DECIMAL calculation.
 *      * Example: if x = 37 and total = 90, print: "37/90 is 0.4111111111111111"
 *    - If total <= 0, print an error message and skip the percentage.
 *
 *  Challenge task (up to A+ level):
 *    - If x < 0 or x > 100, print "Wrong number!".
 *    - Otherwise:
 *        Check to see if x is a prime number. A prime number less than
 *        100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 *        Print your results
 */
public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        //this is the basic task:

        System.out.println("Give me a whole number: ");
        int num = Integer.valueOf(scanner.nextLine());
        if ((num % 2) == 0) {
            System.out.println("Number " + num + " is even.");
        }else if ((num % 2) != 0) {
            System.out.println("Number " + num + " is odd");
        }else if (num == 0)
            System.out.println("ZERO");

        //This is the moderate task:

        System.out.println("Give me another whole number: ");
        double total = Double.valueOf(scanner.nextLine());
        if (total<= 0) {
            System.out.println("ERROR");
        }else{
            double calculation = num / total;
            System.out.println(num + "/" + total + " is " + calculation);
        }
        
        // This is the challenge task:
        if (num < 0 || num > 100) {
            System.out.println("Wrong number!");
        }else if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println(num + " is a prime number.");
        }else if (num % 2 == 0 || num % 3 == 0 || num % 5 ==  0 || num % 7 == 0) {
            System.out.println(num + " is not a prime number.");
        }else {
            System.out.println(num + " is a prime number.");
        }
    }   
}
