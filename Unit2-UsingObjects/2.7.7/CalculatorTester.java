import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double d1 = keyboard.nextDouble();
        double d2 = keyboard.nextDouble();
        
        Calculator myCalc = new Calculator();
        double sum = myCalc.sum(d1, d2);
        double mult = myCalc.multiply(d1, d2);
        double div = myCalc.divide(d1, d2);
        double sub = myCalc.subtract(d1, d2);
        
        System.out.println(d1 + " + " + d2 + " = " + sum);
        System.out.println(d1 + " - " + d2 + " = " + sub);
        System.out.println(d1 + " * " + d2 + " = " + mult);
        System.out.println(d1 + " / " + d2 + " = " + div);
    }
}
