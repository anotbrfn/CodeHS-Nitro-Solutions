import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       System.out.println("Starting Taffy Timer... ");
       int temp = 0;
       Scanner input = new Scanner(System.in);
       
       while(temp < 270)
       {
           System.out.print("Enter the temperature: ");
           temp = input.nextInt();
           if(temp < 270)
           {
               System.out.println("The mixture isn't ready yet.");
           }
           else
           {
               break;
           }
            
           
       }
       
       System.out.println("Your taffy is ready for the next step!");
    }
}
