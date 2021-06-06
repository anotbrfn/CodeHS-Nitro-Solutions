import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry initial
        Scanner input = new Scanner(System.in);
        String berry = input.nextLine();
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        
        
        // Now you can compare characters using ==
        if(berry.charAt(0) == 'r')
        {
            System.out.println("You ordered raspberry");
        }
        else if(berry.charAt(0) == 'h')
        {
            System.out.println("You ordered huckleberry");
        }
        else if(berry.charAt(0) == 'g')
        {
            System.out.println("You ordered goji berry");
        }
        else
        {
            System.out.println("Berry not recognized");
        }
        // Use comments to list the different
        // branches you will need before you write the code
    }
}
