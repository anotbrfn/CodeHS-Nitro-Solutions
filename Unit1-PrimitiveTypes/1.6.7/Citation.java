import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String author = keyboard.nextLine();
        
        System.out.println("Enter the title of the book: ");
        String title = keyboard.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        String publisher = keyboard.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        String year = keyboard.nextLine();
        
        System.out.println("" + author + ". " + title + "." + "\n" + publisher + ", " + year + ".");
    }
}
