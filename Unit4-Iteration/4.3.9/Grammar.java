import java.util.Scanner;

public class Grammar
{
    
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence that uses the word 2 instead of to:");
        String sentence = input.nextLine();
        String last = useProperGrammar(sentence);
        System.out.println(last);
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String last = theText;
        int count = 0;
        
        for(int i = 0; i < last.length(); i++)
        {
            if(last.charAt(i) == '2')
            {
                last = last.substring(0, i) + "to" + last.substring(i + 1);
                count += 1;
            }
        }
        
        String result = last + "\n" + "Fixed " + count + " grammatical errors:";
        
        return result;
    }
}
