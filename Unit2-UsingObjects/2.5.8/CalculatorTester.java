import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        Scanner keyboard = new Scanner(System.in);
        double d1 = keyboard.nextDouble();
        double d2 = keyboard.nextDouble();
        
        System.out.println(d1);
        System.out.println(d2);
        
        Calculator calc = new Calculator();
        calc.sum(d1, d2);
        calc.subtract(d1, d2);
        calc.multiply(d1, d2);
        calc.divide(d1, d2);
    }
}
