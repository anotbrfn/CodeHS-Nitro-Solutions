import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter movie rating (as a decimal)");
       double rating = keyboard.nextDouble();
       int finalRate = (int) (rating + 0.5);
       
       System.out.println("Rating rounded: " + finalRate);
    }
}
