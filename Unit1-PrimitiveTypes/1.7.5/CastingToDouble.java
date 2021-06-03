import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First Int: ");
        int first = keyboard.nextInt();
        System.out.println("Second Int: ");
        int second = keyboard.nextInt();
        
        double result = (double)first / second;
        System.out.println(result);
    }
}
