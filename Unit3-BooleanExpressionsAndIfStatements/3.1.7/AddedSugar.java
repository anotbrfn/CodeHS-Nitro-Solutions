import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today?");
        int grams = input.nextInt();
        // Use a boolean expression to print if they can eat more sugar
        boolean more = grams < 30;
        System.out.println("You can eat more sugar: " + more);
    }
}
