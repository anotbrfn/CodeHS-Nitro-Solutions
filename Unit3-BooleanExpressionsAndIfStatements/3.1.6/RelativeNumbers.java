import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        // Ask for two numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // Compare the numbers as instructed
        boolean bool1 = num1 < num2;
        boolean bool2 = num1 == num2;
        boolean bool3 = num1 > num2;

        // Display the results
        System.out.println(num1 + " < " + num2 + ": " + bool1);
        System.out.println(num1 + " == " + num2 + ": " + bool2);
        System.out.println(num1 + " > " + num2 + ": " + bool3);
    }
}
