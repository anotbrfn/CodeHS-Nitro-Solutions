import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = keyboard.nextLine();
        Bot boi = new Bot(name);
        boi.greeting();
        boi.help();
        System.out.println("What's the weather like?");
        boi.weather();
        System.out.println("How many feet in a mile?");
        boi.feetInMile();
        boi.goodbye();
    }
}
