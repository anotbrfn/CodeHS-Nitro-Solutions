import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction half = new Fraction(1, 2);
        // Ask for input
        System.out.println("Enter the numerator: ");
        int num = input.nextInt();
        System.out.println("Enter the denominator: ");
        int den = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction myFrac = new Fraction(num, den);
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int finalNum = half.getNumerator() * myFrac.getDenominator() + half.getDenominator() * myFrac.getNumerator();
        int finalDen = half.getDenominator() * myFrac.getDenominator();
        Fraction result = new Fraction(finalNum, finalDen);
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(half + " + " + myFrac + " = " + result);
        
    }
}
