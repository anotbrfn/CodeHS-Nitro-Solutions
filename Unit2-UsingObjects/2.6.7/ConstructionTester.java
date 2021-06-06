import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double rate = keyboard.nextDouble();
        System.out.println("How many boards do you need?");
        int boards = keyboard.nextInt();
        System.out.println("How many windws do you need?");
        int windows = keyboard.nextInt();
        
        Construction myConstruction = new Construction(8, 11, rate);
        
        double lumberCost = myConstruction.lumberCost(boards);
        double windowsCost = myConstruction.windowCost(windows);
        
        double total = lumberCost + windowsCost;
        System.out.println("Total: " + total);
        double grandTotal = myConstruction.grandTotal(total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
