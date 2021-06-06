import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 0)
        {
            System.out.println("The numver is positive!");
        }
        else if(num < 0)
        {
            System.out.println("The numver is negative!");
        }
        else if(num == 0)
        {
            System.out.println("The numver is neither positive nor negative!");
        }
    }
}
