import java.util.Scanner;

public class FindMinimum 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the minimum.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third integer: ");
        int num3 = input.nextInt();
        
        int minimum = Math.min(num1, Math.min(num2, num3));
        System.out.println("The minimum is " + minimum);
    }
}
