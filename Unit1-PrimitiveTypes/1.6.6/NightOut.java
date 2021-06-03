import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much did dinner cost?");
        double dinner = input.nextDouble();
        System.out.println("How much is mini-golf for one person?");
        double minigolf = input.nextDouble() * 2;
        System.out.println("How much did dessert cost?");
        double dessert = input.nextDouble();
        
        System.out.println("Dinner: $" + dinner);
        System.out.println("Mini-Golf: $" + minigolf);
        System.out.println("Dessert: $" + dessert);
        double result = dinner + minigolf + dessert;
        System.out.println("Grand Total: $" + result);
    }
}
