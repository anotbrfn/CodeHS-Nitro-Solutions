import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       //Start Here!
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Hello. What is your name?");
       String name = keyboard.nextLine();
       
       Bot2 myBot = new Bot2(name);
       myBot.greeting();
       
       System.out.println("What is your favorite animal?");
       String animal = keyboard.nextLine();
       myBot.favoriteAnimal(animal);
       
       System.out.println("Where do you live?");
       String place = keyboard.nextLine();
       myBot.home(place);
       
       System.out.println("What is your favorite number?");
       int num = keyboard.nextInt();
       myBot.favoriteNumber(num);
       
       myBot.goodbye();
    }
}
