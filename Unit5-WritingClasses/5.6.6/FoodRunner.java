import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Food hb = new Food("Hamburgers", 600);
        Food ff = new Food("Friench Fries", 350);
        Food ck = new Food("Coke", 200);
        
        System.out.println(hb);
        System.out.println("How many would you like?");
        int number1 = input.nextInt();
        int hbCals = hb.getCalories();
        hbCals *= number1;
        
        System.out.println(ff);
        System.out.println("How many would you like?");
        int number2 = input.nextInt();
        int ffCals = ff.getCalories();
        ffCals *= number2;
        
        System.out.println(ck);
        System.out.println("How many would you like?");
        int number3 = input.nextInt();
        int ckCals = ck.getCalories();
        ckCals *= number3;
        
        System.out.println("Your meal with have a toal of " + (ckCals + ffCals + hbCals) + " calories");
    }
}
