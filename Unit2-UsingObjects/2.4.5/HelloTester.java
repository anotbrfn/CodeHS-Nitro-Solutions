import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        Hello hello = new Hello(name);
        hello.english();
        hello.chinese();
        hello.russian();
    }
}
