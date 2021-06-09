import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner(System.in);
        int smallest = 100;
        int largest = 0;
        
        while(true)
        {
            System.out.println("Enter a number (-1 to quit):");
            int num = input.nextInt();
            
            if(num == -1)
            {
                break;
            }
            if(num < smallest)
            {
                smallest = num;
            }
            if(num > largest)
            {
                largest = num;
            }
            
            System.out.println("Smallest # so far: " + smallest);
            System.out.println("Largest # so far: " + largest);
        }
    }
}
