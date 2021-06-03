import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a double:");
        double myDouble = keyboard.nextDouble();
        int integerVal = (int)myDouble;
        
        System.out.println(integerVal);
    }
}
