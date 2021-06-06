import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes test = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value: ");
        int guess = input.nextInt();
        
        // Compute and display the difference
        // between the max and the guess
        int offBy = test.maxDiff(guess);
        System.out.println("You were off by " + offBy);
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the minimum Integer value: ");
        int guess2 = input.nextInt();
        
        // Compute and display the difference 
        // between the min and the guess
        int offBy2 = test.minDiff(guess2);
        System.out.println("You were off by " + offBy2);
        
        
    }
}
