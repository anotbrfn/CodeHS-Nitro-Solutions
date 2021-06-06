public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);
        
        // Double the number
        // Print it out
        double num = game.doubleNumber();
        System.out.println(num);
        
        // Square the number
        // Print it out
        num = game.squareNumber();
        System.out.println(num);
        // Double the number again
        // Print it out
        num = game.doubleNumber();
        System.out.println(num);
        // Get the number and store the value
        // Print it out to see that getNumber does
        // not modify the number
        double finalVal = game.getNumber();
        System.out.println(finalVal);
    }
}
