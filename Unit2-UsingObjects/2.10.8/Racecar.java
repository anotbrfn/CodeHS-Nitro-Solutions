public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double t = Math.round((Math.sqrt((2 * distance) / accel)) * 100) / 100.0;
        return t;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}
