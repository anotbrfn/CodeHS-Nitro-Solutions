public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (9 + 1) + 1);
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        return (int)(Math.random() * ((max-min) + 1) + min);
        
    }
}
