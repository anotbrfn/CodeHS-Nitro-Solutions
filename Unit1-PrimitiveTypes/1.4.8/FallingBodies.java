public class FallingBodies
{
    public static void main(String[] args)
    {
        // Start here!
        
        double g = 9.8;
        double time = 10;
        
        double height = .5 * g * (time * time);
        double velocity = g * time;
        
        System.out.println("Height: " + height);
        System.out.println("Velocity: " + velocity);
    }
}
