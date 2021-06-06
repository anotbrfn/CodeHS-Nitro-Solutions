import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
        
        Scanner input = new Scanner(System.in);
        System.out.print("First string? ");
        String string1 = input.nextLine();
        System.out.print("Second string? ");
        String string2 = input.nextLine();
        System.out.print("Third string? ");
        String string3 = input.nextLine();
        
        if((string1 + string2).equals(string3))
        {
            System.out.println(string1 + " + " + string2 + " is equal to " + string3 + "!");
        }
        else
        {
            System.out.println(string1 + " + " + string2 + " is not equal to " + string3 + "!");
        }
    }
}
