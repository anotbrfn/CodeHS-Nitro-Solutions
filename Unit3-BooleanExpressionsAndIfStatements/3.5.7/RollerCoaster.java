import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);       
        int height = input.nextInt();
        int age = input.nextInt();
        
        if(height >= 42 && age >= 9)
        {
            System.out.println("Welcome aboard!");
        }
        else
        {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
