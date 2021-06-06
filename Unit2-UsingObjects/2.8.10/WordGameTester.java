import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        // Scramble it
        // Print out scrambled word
        WordGames firstWord = new WordGames(word);
        System.out.println(firstWord.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        word = input.nextLine();
        
        // Add random word at index
        // Print out the word
        WordGames secWord = new WordGames(word);
        System.out.println(secWord.bananaSplit(idx, "BOO"));
        
        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String character = input.nextLine();
        // Ask for random word
        System.out.println("Enter a word: ");
        word = input.nextLine();
        WordGames thirdWord = new WordGames(word);
        // Add random word at character
        System.out.println(thirdWord.bananaSplit(character, "BOO"));
        // Print out the word
        
        
        
    }
}
