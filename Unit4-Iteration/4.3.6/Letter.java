import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        System.out.println("Enter the letter you want to replace:");
        String letterToReplace = input.nextLine();
        System.out.println("Enter the replacing character:");
        String replacer = input.nextLine();
        
        String last = replaceLetter(word, letterToReplace, replacer);
        System.out.println(last);
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replacer)
    {
        
        int count = 0;
        String last = word;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                last = last.substring(0, i) + replacer + last.substring(i + 1);
            }
        }
        return last;
    }
}
